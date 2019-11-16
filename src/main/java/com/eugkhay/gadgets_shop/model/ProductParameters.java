package com.eugkhay.gadgets_shop.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class ProductParameters {

    @Id
    public ObjectId _id;
    private String brand;
    private SocksType socksType;
    private String textile;
    private String color;
    private Integer size;
}

