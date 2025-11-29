package com.phonemarket.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phonemarket.entity.Merchant;
import com.phonemarket.service.IMerchantService;

@Controller
@RequestMapping("/merchant")
public class MerchantController {

    @Autowired
    private IMerchantService merchantService;

    @RequestMapping("register")
    @ResponseBody
    public String register(Merchant merchant) {
        if (merchantService.findByMerchantName(merchant.getMerchantName()) != null) {
            return "merchant_exist";
        }
        merchant.setMerchantState(1); // 1: active
        merchant.setCreateTime(new Date());
        merchant.setUpdateTime(new Date());
        return merchantService.saveMerchant(merchant) ? "success" : "fail";
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(String merchantName, String merchantPass, HttpSession session) {
        Merchant merchant = merchantService.findByMerchantName(merchantName);
        if (merchant == null) {
            return "merchant_not_exist";
        }
        if (!merchant.getMerchantPass().equals(merchantPass)) {
            return "password_error";
        }
        session.setAttribute("merchant", merchant);
        return "success";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.removeAttribute("merchant");
        return "redirect:/merchant/login";
    }

    @RequestMapping("profile")
    @ResponseBody
    public Merchant profile(HttpSession session) {
        Merchant merchant = (Merchant) session.getAttribute("merchant");
        return merchant != null ? merchantService.findById(merchant.getMerchantId()) : null;
    }

    @RequestMapping("updateProfile")
    @ResponseBody
    public String updateProfile(Merchant merchant, HttpSession session) {
        Merchant currentMerchant = (Merchant) session.getAttribute("merchant");
        if (currentMerchant == null) {
            return "not_login";
        }
        merchant.setMerchantId(currentMerchant.getMerchantId());
        merchant.setUpdateTime(new Date());
        return merchantService.updateMerchant(merchant) ? "success" : "fail";
    }
}