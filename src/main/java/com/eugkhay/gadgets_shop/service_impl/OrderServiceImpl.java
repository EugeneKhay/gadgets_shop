package com.eugkhay.gadgets_shop.service_impl;

import com.eugkhay.gadgets_shop.model.Order;
import com.eugkhay.gadgets_shop.model.Product;
import com.eugkhay.gadgets_shop.repository.OrderRepo;
import com.eugkhay.gadgets_shop.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepo orderRepo;

    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    @Override
    public Order getOrderById(String id) {
        return orderRepo.findBy_id(id);
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public Order updateOrder(Order orderFromDB, Order order) {
        BeanUtils.copyProperties(order, orderFromDB, "_id");
        return orderRepo.save(orderFromDB);
    }

    @Override
    public void deleteOrder(Order order) {
        orderRepo.delete(order);
    }
}
