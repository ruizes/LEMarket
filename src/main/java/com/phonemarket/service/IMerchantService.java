package com.phonemarket.service;

import com.phonemarket.entity.Merchant;

public interface IMerchantService {
    boolean saveMerchant(Merchant merchant);
    Merchant findByMerchantName(String merchantName);
    boolean updateMerchant(Merchant merchant);
    boolean deleteMerchant(Integer merchantId);
    Merchant findById(Integer merchantId);
}