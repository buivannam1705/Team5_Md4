package com.casemodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
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

}
