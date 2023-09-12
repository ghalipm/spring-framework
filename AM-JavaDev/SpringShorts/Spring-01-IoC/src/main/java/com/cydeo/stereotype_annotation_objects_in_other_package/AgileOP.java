package com.cydeo.stereotype_annotation_objects_in_other_package;

import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */
@Component
public class AgileOP {
    public void getTeachingHours(){
        System.out.println("Agile weekly teaching hours : "+ 10);
    }
}
