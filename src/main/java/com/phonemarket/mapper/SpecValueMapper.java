package com.phonemarket.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.phonemarket.entity.SpecValue;

@Repository
public interface SpecValueMapper {
    SpecValue findSpecValueById(Integer id);
    Integer addSpecValue(SpecValue specValue);
    Integer deleteSpecValue(Integer id);
    Integer updateSpecValue(SpecValue specValue);
    List<SpecValue> findAllSpecValue();
    List<SpecValue> findSpecValueBySpecId(Integer specId);
}
