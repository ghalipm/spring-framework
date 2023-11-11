package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;

/**
 * @author ghalipm on 11/11/2023
 * @project ecommerce_app
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseEntity{

    private String name;

}
