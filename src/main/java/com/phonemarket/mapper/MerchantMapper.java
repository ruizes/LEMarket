package com.phonemarket.mapper;

import com.phonemarket.entity.Merchant;

public interface MerchantMapper {
    int saveMerchant(Merchant merchant);
    Merchant findByMerchantName(String merchantName);
    int updateMerchant(Merchant merchant);
    int deleteMerchant(Integer merchantId);
    Merchant findById(Integer merchantId);
}