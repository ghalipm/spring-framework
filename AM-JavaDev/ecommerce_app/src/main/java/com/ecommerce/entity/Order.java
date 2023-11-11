package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

/**
 * @author ghalipm on 11/11/2023
 * @project ecommerce_app
 */
@Entity
@Table(appliesTo = "orders")
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
