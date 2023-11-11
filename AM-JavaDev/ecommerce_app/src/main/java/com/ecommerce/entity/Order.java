package com.ecommerce.entity;


import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
//import org.hibernate.annotations.Table;// this is not the correct import
import javax.persistence.Table;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

/**
 * @author ghalipm on 11/11/2023
 * @project ecommerce_app
 */
@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order extends BaseEntity {

    private BigDecimal paidPrice;

    private BigDecimal totalPrice;

    @OneToOne
    private Payment payment;

    @OneToOne
    private Cart cart;

    @ManyToOne
    private Customer customer;
}
