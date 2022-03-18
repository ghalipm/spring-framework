package com.cydeo.model;

import com.cydeo.enums.Contract;
import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
public class Teacher {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private BigDecimal salary;
    private Contract contract;

}
