package com.phonemarket.entity;

import java.io.Serializable;

public class Spec implements Serializable {
    private Integer specId;
    private String specName;

    public Spec() {
        super();
    }

    public Spec(Integer specId, String specName) {
        super();
        this.specId = specId;
        this.specName = specName;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }
}
