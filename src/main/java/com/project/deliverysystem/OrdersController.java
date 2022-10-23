package com.project.deliverysystem;

import com.project.deliverysystem.models.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/orders")
public class OrdersController {

    private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService){
        this.ordersService = ordersService;
    }

    // returns some orders
    @GetMapping
    public List<Order> getOrders(){
        return ordersService.getOrders();
    }

    @PostMapping
    public void postOrder(@RequestBody Order arg_order){
        ordersService.createOrder(arg_order);
    }

    @PutMapping(path="{arg_id}")
    public void putOrder(@PathVariable Long arg_id,@RequestBody Order arg_order){
        ordersService.updateOrder(arg_id, arg_order);
    }

    @DeleteMapping(path="{arg_id}")
    public void deleteOrder(@PathVariable Long arg_id){
        ordersService.deleteOrder(arg_id);
    }
}