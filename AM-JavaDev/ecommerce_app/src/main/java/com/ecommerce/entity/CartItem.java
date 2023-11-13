package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;

import javax.persistence.ManyToOne;

/**
 * @author ghalipm on 11/11/2023
 * @project ecommerce_app
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartItem extends BaseEntity{

    private Integer quantity;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Cart cart;

    //a table with ID is an entity, but no ID, then the table is not an entity, just a table
    // And for this table, one should use @JoinTable annotation; and @joinColumns and @inverseJoinColumns
    // are used to specify the columns of the table that are used to join the two entities: product_category_rel
    // but cart_item has id, so it is an entity.
}
