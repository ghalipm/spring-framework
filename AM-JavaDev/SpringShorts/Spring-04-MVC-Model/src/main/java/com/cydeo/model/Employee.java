package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ghalipm on 9/14/2023
 * @project SpringShorts
 */

@Data
@AllArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
}
