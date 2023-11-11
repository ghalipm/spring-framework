package com.ecommerce.entity;

import com.ecommerce.enums.CartState;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.hibernate.annotations.Entity; // this is not the correct import
import javax.persistence.Entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 * @author ghalipm on 11/11/2023
 * @project ecommerce_app
 */
@Entity
@Getter
@Setter
@NoArgsConstructor

public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne
    private Discount discount;
    @ManyToOne
    private Customer customer;
}
