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
}
