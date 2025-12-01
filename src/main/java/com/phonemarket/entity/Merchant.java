package com.phonemarket.entity;

import java.io.Serializable;
import java.util.Date;

public class Merchant implements Serializable {
    private Integer merchantId;
    private String merchantName;
    private String merchantPhone;
    private String merchantEmail;
    private String merchantPass;
    private String merchantAddress;
    private String merchantImg;
    private Integer merchantState;
    private Date createTime;
    private Date updateTime;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public String getMerchantPass() {
        return merchantPass;
    }

    public void setMerchantPass(String merchantPass) {
        this.merchantPass = merchantPass;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public String getMerchantImg() {
        return merchantImg;
    }

    public void setMerchantImg(String merchantImg) {
        this.merchantImg = merchantImg;
    }

    public Integer getMerchantState() {
        return merchantState;
    }

    public void setMerchantState(Integer merchantState) {
        this.merchantState = merchantState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Merchant() {
    }

    public Merchant(Integer merchantId, String merchantName, String merchantPhone, String merchantEmail, String merchantPass, String merchantAddress, String merchantImg, Integer merchantState, Date createTime, Date updateTime) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantPhone = merchantPhone;
        this.merchantEmail = merchantEmail;
        this.merchantPass = merchantPass;
        this.merchantAddress = merchantAddress;
        this.merchantImg = merchantImg;
        this.merchantState = merchantState;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
