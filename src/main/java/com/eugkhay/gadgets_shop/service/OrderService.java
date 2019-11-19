package com.eugkhay.gadgets_shop.service;

import com.eugkhay.gadgets_shop.model.Order;
import com.eugkhay.gadgets_shop.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();
    Order getOrderById(String id);
    Order createOrder(Order product);
    Order updateOrder(Order orderFromDB, Order order);
    void deleteOrder(Order order);
}
