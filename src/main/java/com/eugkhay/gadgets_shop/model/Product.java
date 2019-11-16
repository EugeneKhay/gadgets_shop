package com.eugkhay.gadgets_shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "Products")
public class Product {

    @Id
    public String _id;
    private String name;
    private Double price;
    private ProductCategory productCategory;
    private ProductParameters productParameters;
    private Integer stockAmount;

}
