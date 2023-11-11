package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

/**
 * @author ghalipm on 11/10/2023
 * @project ecommerce_app
 */

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Balance extends BaseEntity{

    private BigDecimal amount;

    @OneToOne
    private Customer customer;



}
