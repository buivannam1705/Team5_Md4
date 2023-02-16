<<<<<<< HEAD
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
=======
package com.casemodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "int default 1")
    private int status;
    private Long quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Size size;

}
>>>>>>> 9d1ea54a26c96830a3a28a3f3e35b4bb42c547b2
