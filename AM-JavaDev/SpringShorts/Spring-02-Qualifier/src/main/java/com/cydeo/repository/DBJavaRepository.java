package com.cydeo.repository;

import com.cydeo.model.Java;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/12/2023
 * @project SpringShorts
 */
@Component
public class DBJavaRepository implements JavaRepository {

    @Override
    public int returnHours() {
        Java java=new Java(30);
        return java.getTeachingHours();
    }
}
