package com.project.deliverysystem.models;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @SequenceGenerator(
        name="orders_sequence", allocationSize = 1
    )
    @GeneratedValue(
        generator = "orders_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private Double weight;

    public Order(){}
    public Order(Long arg_id, Double arg_weight){
        this.id = arg_id;
        this.weight = arg_weight;
    }
    public Order(Double arg_weight){
        this.weight = arg_weight;
    }

    public Long getId(){
        return id;
    }

    public Double getWeight(){
        return weight;
    }
}
