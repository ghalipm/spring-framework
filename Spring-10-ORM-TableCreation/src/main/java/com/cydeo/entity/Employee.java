package com.cydeo.entity;


import javax.persistence.*;

@Entity
//@Table(name = "employees")
public class Employee { // employee

    @GeneratedValue(strategy = GenerationType.IDENTITY) // creates ID automatically by Spring
    @Id
    private int id;
    private String name;
}
