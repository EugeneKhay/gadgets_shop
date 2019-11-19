package com.eugkhay.gadgets_shop.repository;

import com.eugkhay.gadgets_shop.model.Order;
import com.eugkhay.gadgets_shop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<Order, String> {

    Order findBy_id(String id);
}
