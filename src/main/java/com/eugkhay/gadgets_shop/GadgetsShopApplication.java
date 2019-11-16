package com.eugkhay.gadgets_shop;

import com.eugkhay.gadgets_shop.model.Client;
import com.eugkhay.gadgets_shop.model.Product;
import com.eugkhay.gadgets_shop.repository.ProductRepo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@SpringBootApplication
public class GadgetsShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(GadgetsShopApplication.class, args);
	}

}
