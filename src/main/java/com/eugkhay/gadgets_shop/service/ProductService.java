package com.eugkhay.gadgets_shop.service;

import com.eugkhay.gadgets_shop.model.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(String id);
    Product createProduct(Product product);
    Product updateProduct(Product productFromDB, Product product);
    void deleteProduct(Product product);
}
