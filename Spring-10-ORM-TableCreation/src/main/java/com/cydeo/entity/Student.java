package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "students") // custom table name as students rather than student
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // creates ID
    private Long id; //still need this line, but no need to provide it when inserting in data.sql
    private String firstName; //in the table: first_name

    @Column(name = "studentLastName") //modified lastName
    private String lastName;
    private String email;

    @Transient
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
