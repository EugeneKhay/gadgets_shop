package com.eugkhay.gadgets_shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "ProductParameters")
public class ProductParameters {

    @Id
    public String _id;
    private String brand;
    private SocksType socksType;
    private String textile;
    private String color;
    private Integer size;
}

