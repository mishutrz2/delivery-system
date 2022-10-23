package com.project.deliverysystem;

import com.project.deliverysystem.models.Order;

import java.util.List;

public interface IOrdersService {
    public List<Order> getOrders();
    public void createOrder(Order arg_order);
    public void updateOrder(Long arg_id, Order arg_order);
    public void deleteOrder(Long arg_id);
}
