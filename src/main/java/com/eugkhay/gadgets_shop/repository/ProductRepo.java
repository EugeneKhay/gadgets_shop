package com.eugkhay.gadgets_shop.repository;

import com.eugkhay.gadgets_shop.model.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, String> {

    Product findBy_id(String id);
}
