package com.cydeo.model;

import com.cydeo.enums.Department;
import com.cydeo.enums.Gender;
import com.cydeo.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private Department dept;
    private Role role;
    private Double salary;
    private Double history; // years with company

}
