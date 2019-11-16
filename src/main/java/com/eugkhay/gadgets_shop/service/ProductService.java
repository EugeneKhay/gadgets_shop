package com.eugkhay.gadgets_shop.service;

import com.eugkhay.gadgets_shop.model.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(@PathVariable String id);
    Product createProduct(@RequestBody Product product);
    Product updateProduct(@PathVariable("id") Product productFromDB, @RequestBody Product product);
    void deleteProduct(@PathVariable("id") Product product);
}
