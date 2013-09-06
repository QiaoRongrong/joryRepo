package com.fruitstore.persistence.model;

public class Membership {
    private Integer level;

    private Float discountrate;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Float getDiscountrate() {
        return discountrate;
    }

    public void setDiscountrate(Float discountrate) {
        this.discountrate = discountrate;
    }
}