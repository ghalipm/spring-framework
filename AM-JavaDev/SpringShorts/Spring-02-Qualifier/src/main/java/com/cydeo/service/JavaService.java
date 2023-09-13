package com.cydeo.service;

import com.cydeo.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/12/2023
 * @project SpringShorts
 */
@Component
public class JavaService {
    private final ExtraSessions extraSessions;
    private final JavaRepository javaRepository;

    @Autowired
    //public JavaService(@Qualifier("officeHoursService") ExtraSessions extraSessions, JavaRepository javaRepository) {
    public JavaService(@Qualifier("MHS") ExtraSessions extraSessions, JavaRepository javaRepository) {
        this.extraSessions = extraSessions;
        this.javaRepository = javaRepository;
    }

    public void getTeachingHours(){
        System.out.println("Weekly Java Hours: "+(javaRepository.returnHours()+extraSessions.getHours()));
    }

}
