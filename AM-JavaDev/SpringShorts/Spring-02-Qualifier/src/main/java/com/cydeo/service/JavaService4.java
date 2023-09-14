package com.cydeo.service;

import com.cydeo.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/13/2023
 * @project SpringShorts
 */

@Lazy
@Component
public class JavaService4 {
    private final ExtraSessions officeHours;
    private final ExtraSessions mentoringHours;
    private final JavaRepository javaRepository;

    @Autowired
    public JavaService4(@Qualifier("OHS") ExtraSessions officeHours, @Qualifier("MHS") ExtraSessions mentoringHours, JavaRepository javaRepository) {
        this.officeHours = officeHours;
        this.mentoringHours = mentoringHours;
        this.javaRepository = javaRepository;
        System.out.println("Eager Test - JavaService4 constructor");
    }

    public void getTeachingHours(){
        System.out.println("Weekly Java Hours: "+(javaRepository.returnHours()+mentoringHours.getHours()+officeHours.getHours()));
    }

}

