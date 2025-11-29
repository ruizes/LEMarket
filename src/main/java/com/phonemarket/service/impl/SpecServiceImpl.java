package com.phonemarket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonemarket.entity.Spec;
import com.phonemarket.repository.SpecRepository;
import com.phonemarket.service.SpecService;

@Service
public class SpecServiceImpl implements SpecService {

    @Autowired
    private SpecRepository specRepository;

    @Override
    public Spec findSpecById(Integer id) {
        return specRepository.findOne(id);
    }

    @Override
    public Integer addSpec(Spec spec) {
        Spec savedSpec = specRepository.save(spec);
        return savedSpec != null ? savedSpec.getSpecId() : null;
    }

    @Override
    public Integer deleteSpec(Integer id) {
        specRepository.delete(id);
        return 1; // Return 1 to indicate success
    }

    @Override
    public Integer updateSpec(Spec spec) {
        Spec existingSpec = specRepository.findOne(spec.getSpecId());
        if (existingSpec == null) {
            return 0; // Return 0 if spec not found
        }
        specRepository.save(spec);
        return 1; // Return 1 to indicate success
    }

    @Override
    public List<Spec> findAllSpec() {
        return specRepository.findAll();
    }

    @Override
    public Spec findSpecBySpecName(String specName) {
        return specRepository.findBySpecName(specName);
    }

    @Override
    public List<Spec> findSpecBySpecNameContaining(String specName) {
        return specRepository.findBySpecNameContaining(specName);
    }
}
