package com.eugkhay.gadgets_shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Objects;

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

    //TODO Add comparsions methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
