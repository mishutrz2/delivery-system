package com.project.deliverysystem;

import com.project.deliverysystem.models.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrdersService {
    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository){
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<Order> getOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public void createOrder(Order arg_order){
        //
        // validation
        //
        ordersRepository.save(arg_order);
    }

    @Override
    public void updateOrder(Long arg_id, Order arg_order){
        Order orderToUpdate = ordersRepository.findById(arg_id).orElseThrow(() -> new IllegalStateException(String.format("did not find order with id %s", arg_id)));

        orderToUpdate.setWeight(arg_order.getWeight());

        ordersRepository.save(orderToUpdate);
    }

    @Override
    public void deleteOrder(Long arg_id){
        if (!ordersRepository.existsById(arg_id)){
            throw new IllegalStateException(String.format("did not find order with id %s", arg_id));
        }
        ordersRepository.deleteById(arg_id);
    }
}
