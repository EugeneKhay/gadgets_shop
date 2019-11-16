package com.eugkhay.gadgets_shop.repository;

import com.eugkhay.gadgets_shop.model.ClientAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientAddressRepo extends MongoRepository<ClientAddress, String> {
}
