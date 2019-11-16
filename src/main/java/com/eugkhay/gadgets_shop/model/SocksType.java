package com.eugkhay.gadgets_shop.model;

public enum SocksType {
    MEN("men"),
    WOMEN("women"),
    KIDS("kids");

    private String type;

    SocksType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
