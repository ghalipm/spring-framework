package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.hibernate.annotations.Entity; // this is not the correct import
import javax.persistence.Entity;

import javax.persistence.ManyToOne;

/**
 * @author ghalipm on 11/10/2023
 * @project ecommerce_app
 */

@Entity
@NoArgsConstructor // this type of constructor is needed due to JPA Repository
@Getter
@Setter
public class Address extends BaseEntity{

    private String name;
    private String street;
    private String zipCode;

    //Many Address to One Customer
    @ManyToOne
    private Customer customer;

    //a table with ID is an entity, but no ID, then the table is not an entity, but just a table and
    // And for this table, one should use @JoinTable annotation; and @joinColumns and @inverseJoinColumns
    // are used to specify the columns of the table that are used to join the two entities: product_category_rel
    // but cart_item is an entity.
}
