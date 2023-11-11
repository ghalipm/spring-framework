package com.ecommerce.entity;

import com.ecommerce.enums.DiscountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

/**
 * @author ghalipm on 11/11/2023
 * @project ecommerce_app
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Discount extends BaseEntity{

    private BigDecimal discount;
    private String name;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

}
