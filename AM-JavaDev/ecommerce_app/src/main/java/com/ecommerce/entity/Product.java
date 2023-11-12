package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author ghalipm on 11/11/2023
 * @project ecommerce_app
 */
@Entity
@NoArgsConstructor
@Setter
@Getter
public class Product extends BaseEntity{

    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer remainingQuantity;

    // it is better to use @ManyToMany annotation in the entity that has lesser data: better performance
    // For one Category, there can be a lot of Products, but for one Product, there will be lesser number of Categories
    @ManyToMany
    @JoinTable(name = "product_category_rel",
            joinColumns = @JoinColumn(name = "p_id"),
            inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Category> categoryList;

}
