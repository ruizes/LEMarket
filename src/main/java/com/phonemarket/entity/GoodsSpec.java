package com.phonemarket.entity;

import java.io.Serializable;

public class GoodsSpec implements Serializable {
    private Integer goodsSpecId;
    private Goods goods;
    private String specValueIds;
    private Integer goodsNum;

    public GoodsSpec() {
        super();
    }

    public GoodsSpec(Integer goodsSpecId, Goods goods, String specValueIds, Integer goodsNum) {
        super();
        this.goodsSpecId = goodsSpecId;
        this.goods = goods;
        this.specValueIds = specValueIds;
        this.goodsNum = goodsNum;
    }

    public Integer getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(Integer goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getSpecValueIds() {
        return specValueIds;
    }

    public void setSpecValueIds(String specValueIds) {
        this.specValueIds = specValueIds;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
}
