package com.eugkhay.gadgets_shop.service;

import com.eugkhay.gadgets_shop.model.Order;
import com.eugkhay.gadgets_shop.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderService {

    List<Product> getAllOrders();
    Product getOrderById(@PathVariable String id);
    Product createOrder(@RequestBody Order product);
    Product updateOrder(@PathVariable("id") Order orderFromDB, @RequestBody Order order);
    void deleteOrder(@PathVariable("id") Order order);
}
