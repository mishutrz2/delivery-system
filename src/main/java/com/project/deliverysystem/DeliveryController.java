package com.project.deliverysystem;

import com.project.deliverysystem.models.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/orders")
public class DeliveryController {

    private final OrdersRepository myOrdersRepo;
    private final DeliveryLabel myLabel;

    public DeliveryController(OrdersRepository arg_myOrdersRepo, DeliveryLabel arg_myLabel) {
        this.myOrdersRepo = arg_myOrdersRepo;
        this.myLabel = arg_myLabel;
    }

    // returns some orders
    @GetMapping
    public List<Order> getOrder(){
        return myOrdersRepo.findAll();
    }
}