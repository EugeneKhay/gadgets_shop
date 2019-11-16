package com.eugkhay.gadgets_shop.service_impl;

import com.eugkhay.gadgets_shop.model.Product;
import com.eugkhay.gadgets_shop.repository.ProductRepo;
import com.eugkhay.gadgets_shop.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return productRepo.findBy_id(id);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product productFromDB, Product product) {
        BeanUtils.copyProperties(product, productFromDB, "_id");
        return productRepo.save(productFromDB);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepo.delete(product);
    }
}
