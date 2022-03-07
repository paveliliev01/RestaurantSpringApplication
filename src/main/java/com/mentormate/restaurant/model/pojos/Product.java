package com.mentormate.restaurant.model.pojos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;
import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false, insertable = true, updatable = true)
    private Integer productId;

    @Column(name = "product_category", nullable = false)
    private String productCategory;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "product_price", nullable = false)
    private Double productPrice;

    @Column(name = "soft_delete", nullable = false)
    private Integer softDelete;

}
