package com.phonemarket.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.phonemarket.entity.GoodsSpec;

@Repository
public interface GoodsSpecMapper {
    GoodsSpec findGoodsSpecById(Integer id);
    Integer addGoodsSpec(GoodsSpec goodsSpec);
    Integer deleteGoodsSpec(Integer id);
    Integer updateGoodsSpec(GoodsSpec goodsSpec);
    List<GoodsSpec> findGoodsSpecByGoodsId(Integer goodsId);
    GoodsSpec findGoodsSpecByGoodsIdAndSpecValueIds(Integer goodsId, String specValueIds);
}
