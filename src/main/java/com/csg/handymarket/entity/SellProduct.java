package com.csg.handymarket.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "SellProduct")
public class SellProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = Employee.class, cascade=CascadeType.PERSIST)
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee_id;

    @ManyToOne(targetEntity = Product.class, cascade=CascadeType.PERSIST)
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product_id;
}