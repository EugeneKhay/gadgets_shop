package com.eugkhay.gadgets_shop.repository;

import com.eugkhay.gadgets_shop.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepo extends MongoRepository<Client, String> {

    Client findByEmail(String email);
}
