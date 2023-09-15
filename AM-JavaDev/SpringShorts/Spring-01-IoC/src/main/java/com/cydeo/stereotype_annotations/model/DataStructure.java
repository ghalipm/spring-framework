package com.cydeo.stereotype_annotations.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/12/2023
 * @project SpringShorts
 */
@Component
@AllArgsConstructor
public class DataStructure {
ExtraHours extraHours;
//// need other class object/bean, so we need to use constructor
//// injection usually. If we use @AllArgConstructor from lombok,
//// we can skip the constructor injection.
//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }

    public void getTotalHours(){
        System.out.println("DS Total hours: "+(40+extraHours.getTotalHours()));
    }
}

/*
 * TASK 2:
 *     1-Create new package under java stereotype_annotations
 *     2-Create Model and Config Package
 *     3- Under the Model package
 *         -DataStructure
 *         -DevOps
 *         -Microservice
 *     4-Create method for each of them which is getTotalHours() and print some hour
 *             exp: "Total hours: "+20;
 *     5-We only need object from DataStructure and Microservices
 *     6-use Stereotype annotation way to solve it.
 */

/*
 * TASK 3:
 *     7-Create ExtraHours class inside the model package.
 *     8-Create a method getHours() - that returns 10;
 *     9- use this method inside the DataStructure class to increaese the total hours
 *     10-try to use lombok annotations for creating constructor
 */