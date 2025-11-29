package com.phonemarket.service;

import java.util.List;

import com.phonemarket.entity.GoodsSpec;

public interface GoodsSpecService {
    // 根据ID查询商品规格
    GoodsSpec findGoodsSpecById(Integer id);
    
    // 新增商品规格
    Integer addGoodsSpec(GoodsSpec goodsSpec);
    
    // 删除商品规格
    Integer deleteGoodsSpec(Integer id);
    
    // 更新商品规格
    Integer updateGoodsSpec(GoodsSpec goodsSpec);
    
    // 根据商品ID查询商品规格
    List<GoodsSpec> findGoodsSpecByGoodsId(Integer goodsId);
    
    // 根据商品ID和规格值ID查询商品规格
    GoodsSpec findGoodsSpecByGoodsIdAndSpecValueId(Integer goodsId, Integer specValueId);
}
