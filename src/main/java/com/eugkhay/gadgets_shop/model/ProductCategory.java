package com.eugkhay.gadgets_shop.model;

public enum ProductCategory {

    DRESSED("Dressed"),
    ATHLETIC("Athletic"),
    REGULAR("Regular"),
    STOCKINGS("Stockings"),
    LIMITED_EDITION("Limited edition");

    private final String value;

    ProductCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

