package com.phonemarket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonemarket.entity.SpecValue;
import com.phonemarket.repository.SpecValueRepository;
import com.phonemarket.service.SpecValueService;

@Service
public class SpecValueServiceImpl implements SpecValueService {

    @Autowired
    private SpecValueRepository specValueRepository;

    @Override
    public SpecValue findSpecValueById(Integer id) {
        return specValueRepository.findOne(id);
    }

    @Override
    public Integer addSpecValue(SpecValue specValue) {
        SpecValue savedSpecValue = specValueRepository.save(specValue);
        return savedSpecValue != null ? savedSpecValue.getSpecValueId() : null;
    }

    @Override
    public Integer deleteSpecValue(Integer id) {
        specValueRepository.delete(id);
        return 1; // Return 1 to indicate success
    }

    @Override
    public Integer updateSpecValue(SpecValue specValue) {
        SpecValue existingSpecValue = specValueRepository.findOne(specValue.getSpecValueId());
        if (existingSpecValue == null) {
            return 0; // Return 0 if spec value not found
        }
        specValueRepository.save(specValue);
        return 1; // Return 1 to indicate success
    }

    @Override
    public List<SpecValue> findAllSpecValue() {
        return specValueRepository.findAll();
    }

    @Override
    public List<SpecValue> findSpecValueBySpecId(Integer specId) {
        return specValueRepository.findBySpecId(specId);
    }

    @Override
    public SpecValue findSpecValueBySpecValueName(String specValueName) {
        return specValueRepository.findBySpecValueName(specValueName);
    }

    @Override
    public SpecValue findSpecValueBySpecIdAndSpecValueName(Integer specId, String specValueName) {
        return specValueRepository.findBySpecIdAndSpecValueName(specId, specValueName);
    }
}
