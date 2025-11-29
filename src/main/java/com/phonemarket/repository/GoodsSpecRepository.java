package com.phonemarket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonemarket.entity.GoodsSpec;

@Repository
public interface GoodsSpecRepository extends JpaRepository<GoodsSpec, Integer> {
    // 根据商品ID查询商品规格
    List<GoodsSpec> findByGoodsId(Integer goodsId);
    
    // 根据商品ID和规格值ID查询商品规格
    GoodsSpec findByGoodsIdAndSpecValueId(Integer goodsId, Integer specValueId);
    
    // 重写findOne方法
    @Override
    GoodsSpec findOne(Integer id);
    
    // 重写delete方法
    @Override
    void delete(Integer id);
}
