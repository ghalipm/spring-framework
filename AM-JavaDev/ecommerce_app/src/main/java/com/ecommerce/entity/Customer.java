package com.ecommerce.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;

/**
 * @author ghalipm on 11/9/2023
 * @project ecommerce_app
 */

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Customer extends BaseEntity {

    private String email;
    private String firstName;
    private String lastName;
    private String userName;
}
