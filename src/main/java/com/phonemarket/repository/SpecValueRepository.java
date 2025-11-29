package com.phonemarket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonemarket.entity.SpecValue;

@Repository
public interface SpecValueRepository extends JpaRepository<SpecValue, Integer> {
    // 根据规格ID查询规格值
    List<SpecValue> findBySpecId(Integer specId);
    
    // 根据规格值名称查询
    SpecValue findBySpecValueName(String specValueName);
    
    // 根据规格ID和名称查询规格值
    SpecValue findBySpecIdAndSpecValueName(Integer specId, String specValueName);
    
    // 重写findOne方法
    @Override
    SpecValue findOne(Integer id);
    
    // 重写delete方法
    @Override
    void delete(Integer id);
}
