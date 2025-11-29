package com.phonemarket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonemarket.entity.GoodsSpec;
import com.phonemarket.repository.GoodsSpecRepository;
import com.phonemarket.service.GoodsSpecService;

@Service
public class GoodsSpecServiceImpl implements GoodsSpecService {

    @Autowired
    private GoodsSpecRepository goodsSpecRepository;

    @Override
    public GoodsSpec findGoodsSpecById(Integer id) {
        return goodsSpecRepository.findOne(id);
    }

    @Override
    public Integer addGoodsSpec(GoodsSpec goodsSpec) {
        GoodsSpec savedGoodsSpec = goodsSpecRepository.save(goodsSpec);
        return savedGoodsSpec != null ? savedGoodsSpec.getGoodsSpecId() : null;
    }

    @Override
    public Integer deleteGoodsSpec(Integer id) {
        goodsSpecRepository.delete(id);
        return 1; // Return 1 to indicate success
    }

    @Override
    public Integer updateGoodsSpec(GoodsSpec goodsSpec) {
        GoodsSpec existingGoodsSpec = goodsSpecRepository.findOne(goodsSpec.getGoodsSpecId());
        if (existingGoodsSpec == null) {
            return 0; // Return 0 if goods spec not found
        }
        goodsSpecRepository.save(goodsSpec);
        return 1; // Return 1 to indicate success
    }

    @Override
    public List<GoodsSpec> findGoodsSpecByGoodsId(Integer goodsId) {
        return goodsSpecRepository.findByGoodsId(goodsId);
    }

    @Override
    public GoodsSpec findGoodsSpecByGoodsIdAndSpecValueId(Integer goodsId, Integer specValueId) {
        return goodsSpecRepository.findByGoodsIdAndSpecValueId(goodsId, specValueId);
    }
}
