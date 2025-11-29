package com.phonemarket.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.phonemarket.entity.Spec;

@Repository
public interface SpecMapper {
    Spec findSpecById(Integer id);
    Integer addSpec(Spec spec);
    Integer deleteSpec(Integer id);
    Integer updateSpec(Spec spec);
    List<Spec> findAllSpec();
}
