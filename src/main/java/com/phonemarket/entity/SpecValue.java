package com.phonemarket.entity;

import java.io.Serializable;

public class SpecValue implements Serializable {
    private Integer specValueId;
    private Spec spec;
    private String specValueName;

    public SpecValue() {
        super();
    }

    public SpecValue(Integer specValueId, Spec spec, String specValueName) {
        super();
        this.specValueId = specValueId;
        this.spec = spec;
        this.specValueName = specValueName;
    }

    public Integer getSpecValueId() {
        return specValueId;
    }

    public void setSpecValueId(Integer specValueId) {
        this.specValueId = specValueId;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public String getSpecValueName() {
        return specValueName;
    }

    public void setSpecValueName(String specValueName) {
        this.specValueName = specValueName;
    }
}
