package com.eugkhay.gadgets_shop.model;

import lombok.Data;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ShoppingCart (List: Product - Amount) -> Order
 */
@Data
public class ShoppingCart {

    // Replace to inner class?
    private Map<Product, Integer> products = new LinkedHashMap<>();

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
