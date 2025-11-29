package com.phonemarket.service;

import com.phonemarket.entity.Goods;

public interface IRedisFlashSaleService {
    // 初始化商品到Redis
    void initFlashSaleGoods(Goods goods);
    
    // 检查是否可以参与秒杀
    boolean canSeckill(Integer goodsId, Integer userId);
    
    // 执行秒杀操作
    boolean seckill(Integer goodsId, Integer userId);
    
    // 获取秒杀剩余库存
    Integer getFlashSaleStock(Integer goodsId);
    
    // 结束秒杀
    void endFlashSale(Integer goodsId);
}