package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ghalipm on 9/9/2023
 * @project spring-framework
 */

@AllArgsConstructor
@Getter
@Setter
public class Employee {
    String name;
    String department;
    int hourlyRate;


}
