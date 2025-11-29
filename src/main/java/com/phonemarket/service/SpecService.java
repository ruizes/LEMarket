package com.phonemarket.service;

import java.util.List;

import com.phonemarket.entity.Spec;

public interface SpecService {
    // 根据ID查询规格
    Spec findSpecById(Integer id);
    
    // 新增规格
    Integer addSpec(Spec spec);
    
    // 删除规格
    Integer deleteSpec(Integer id);
    
    // 更新规格
    Integer updateSpec(Spec spec);
    
    // 查询所有规格
    List<Spec> findAllSpec();
    
    // 根据名称查询规格
    Spec findSpecBySpecName(String specName);
    
    // 根据名称模糊查询规格
    List<Spec> findSpecBySpecNameContaining(String specName);
}
