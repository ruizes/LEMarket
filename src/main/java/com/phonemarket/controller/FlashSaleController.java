package com.phonemarket.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phonemarket.entity.Goods;
import com.phonemarket.entity.Users;
import com.phonemarket.service.IGoodsService;
import com.phonemarket.service.IRedisFlashSaleService;
import com.phonemarket.service.IOrderService;

@Controller
@RequestMapping("/flashsale")
public class FlashSaleController {

    @Autowired
    private IRedisFlashSaleService redisFlashSaleService;
    
    @Autowired
    private IGoodsService goodsService;
    
    @Autowired
    private IOrderService orderService;

    @RequestMapping("init/{goodsId}")
    @ResponseBody
    public String initFlashSale(@PathVariable Integer goodsId) {
        Goods goods = goodsService.findById(goodsId);
        if (goods == null || goods.getFlashSaleStock() == null || goods.getFlashSaleStock() <= 0) {
            return "fail";
        }
        redisFlashSaleService.initFlashSaleGoods(goods);
        return "success";
    }

    @RequestMapping("seckill/{goodsId}")
    @ResponseBody
    public String seckill(@PathVariable Integer goodsId, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("user");
        if (user == null) {
            return "login";
        }

        // 检查是否可以参与秒杀
        if (!redisFlashSaleService.canSeckill(goodsId, user.getUserId())) {
            return "already_seckill";
        }

        // 执行秒杀操作
        if (redisFlashSaleService.seckill(goodsId, user.getUserId())) {
            // 秒杀成功，生成订单
            // 这里可以异步处理订单生成，避免阻塞
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("stock/{goodsId}")
    @ResponseBody
    public Integer getFlashSaleStock(@PathVariable Integer goodsId) {
        return redisFlashSaleService.getFlashSaleStock(goodsId);
    }
}
