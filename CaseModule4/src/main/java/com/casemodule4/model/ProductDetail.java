package com.casemodule4.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer status;
    private int quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Size size;

    public ProductDetail(Integer id, Integer status, int quantity, Product product, Size size) {
        this.id = id;
        this.status = status;
        this.quantity = quantity;
        this.product = product;
        this.size = size;
    }
}
