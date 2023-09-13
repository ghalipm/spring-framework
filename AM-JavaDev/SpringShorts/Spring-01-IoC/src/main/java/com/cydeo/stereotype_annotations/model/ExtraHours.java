package com.cydeo.stereotype_annotations.model;

import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/12/2023
 * @project SpringShorts
 */
@Component
public class ExtraHours {
    public int getTotalHours(){
        return 15;
    }
}
