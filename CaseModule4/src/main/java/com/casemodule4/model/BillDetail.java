package com.casemodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    private ProductDetail productDetail;
    @ManyToOne(fetch = FetchType.EAGER)
    private Bill bill;


}
