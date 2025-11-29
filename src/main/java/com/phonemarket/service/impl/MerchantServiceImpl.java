package com.phonemarket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonemarket.entity.Merchant;
import com.phonemarket.mapper.MerchantMapper;
import com.phonemarket.service.IMerchantService;

@Service
public class MerchantServiceImpl implements IMerchantService {

    @Autowired
    private MerchantMapper merchantMapper;

    @Override
    public boolean saveMerchant(Merchant merchant) {
        return merchantMapper.saveMerchant(merchant) > 0;
    }

    @Override
    public Merchant findByMerchantName(String merchantName) {
        return merchantMapper.findByMerchantName(merchantName);
    }

    @Override
    public boolean updateMerchant(Merchant merchant) {
        return merchantMapper.updateMerchant(merchant) > 0;
    }

    @Override
    public boolean deleteMerchant(Integer merchantId) {
        return merchantMapper.deleteMerchant(merchantId) > 0;
    }

    @Override
    public Merchant findById(Integer merchantId) {
        return merchantMapper.findById(merchantId);
    }
}