package com.cydeo.stereotype_annotation_objects_in_the_package;

import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */
@Component
public class Student {
    public void createAccount(){
        System.out.println("Student is created");
    }

}
