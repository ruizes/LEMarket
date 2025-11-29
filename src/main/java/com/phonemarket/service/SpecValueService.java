package com.phonemarket.service;

import java.util.List;

import com.phonemarket.entity.SpecValue;

public interface SpecValueService {
    // 根据ID查询规格值
    SpecValue findSpecValueById(Integer id);
    
    // 新增规格值
    Integer addSpecValue(SpecValue specValue);
    
    // 删除规格值
    Integer deleteSpecValue(Integer id);
    
    // 更新规格值
    Integer updateSpecValue(SpecValue specValue);
    
    // 查询所有规格值
    List<SpecValue> findAllSpecValue();
    
    // 根据规格ID查询规格值
    List<SpecValue> findSpecValueBySpecId(Integer specId);
    
    // 根据规格值名称查询
    SpecValue findSpecValueBySpecValueName(String specValueName);
    
    // 根据规格ID和规格值名称查询
    SpecValue findSpecValueBySpecIdAndSpecValueName(Integer specId, String specValueName);
}
