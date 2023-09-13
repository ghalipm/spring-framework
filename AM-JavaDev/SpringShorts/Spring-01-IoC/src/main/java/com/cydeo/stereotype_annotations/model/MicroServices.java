package com.cydeo.stereotype_annotations.model;

import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/12/2023
 * @project SpringShorts
 */
@Component
public class MicroServices {

    public void getTotalHours(){
        System.out.println("MS Total hours: "+25);
    }
}
