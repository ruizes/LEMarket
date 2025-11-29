package com.phonemarket.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonemarket.entity.Spec;

@Repository
public interface SpecRepository extends JpaRepository<Spec, Integer> {
    // 根据名称查询规格
    Spec findBySpecName(String specName);
    
    // 根据名称模糊查询规格
    List<Spec> findBySpecNameContaining(String specName);
    
    // 重写findOne方法
    @Override
    Spec findOne(Integer id);
    
    // 重写delete方法
    @Override
    void delete(Integer id);
}
