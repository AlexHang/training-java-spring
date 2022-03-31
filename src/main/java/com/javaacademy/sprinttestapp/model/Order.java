package com.javaacademy.sprinttestapp.model;

import javax.persistence.*;

@Entity
@Table(name = "CustomerOrder")
public class Order {
    @Id
    @GeneratedValue
    private Integer order_id;
    private String name;
    @ManyToOne
    Customer customer;

    public Order(Integer order_id, String name) {
        this.order_id = order_id;
        this.name = name;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
