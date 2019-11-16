package com.eugkhay.gadgets_shop.controllers;

import com.eugkhay.gadgets_shop.model.Product;
import com.eugkhay.gadgets_shop.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable("id") Product productFromDB,
                                 @RequestBody Product product) {
        return productService.updateProduct(productFromDB, product);
    }

    @DeleteMapping("{id}")
    public void deleteTask(@PathVariable("id") Product product) {
        productService.deleteProduct(product);
    }
}
