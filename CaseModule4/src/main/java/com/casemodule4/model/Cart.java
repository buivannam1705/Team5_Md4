package com.casemodule4.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;

    private String name;
    private int productDetail_id;
    private int quantity;
    private String size;
    private String img;
    private double price;

    public Cart(Integer id, String username, String name, int productDetail_id, int quantity, String size, String img, double price) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.productDetail_id = productDetail_id;
        this.quantity = quantity;
        this.size = size;
        this.img = img;
        this.price = price;
    }
}
