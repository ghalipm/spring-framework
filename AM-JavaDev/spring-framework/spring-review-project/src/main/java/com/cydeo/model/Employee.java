package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ghalipm on 9/9/2023
 * @project spring-review-IoC
 */

@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private String name;
    private String department;
    private int hourlyRate;


}
