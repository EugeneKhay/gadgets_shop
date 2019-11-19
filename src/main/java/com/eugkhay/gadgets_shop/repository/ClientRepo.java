package com.eugkhay.gadgets_shop.repository;

import com.eugkhay.gadgets_shop.model.Client;
import com.eugkhay.gadgets_shop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepo extends MongoRepository<Client, String> {

    Client findBy_id(String id);
    Client findByEmail(String email);
}
