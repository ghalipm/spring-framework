package com.cydeo.service;

import com.cydeo.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/13/2023
 * @project SpringShorts
 */

//if wanted to create different instances of beans, use @Scope annotation
@Scope("prototype")
@Component
public class JavaService2 {
    //private final ExtraSessions extraSessions;
    private final ExtraSessions officeHours;
    private final ExtraSessions mentoringHours;
    private final JavaRepository javaRepository;

    @Autowired
    public JavaService2(@Qualifier("OHS") ExtraSessions officeHours, @Qualifier("MHS") ExtraSessions mentoringHours, JavaRepository javaRepository) {
        this.officeHours = officeHours;
        this.mentoringHours = mentoringHours;
        this.javaRepository = javaRepository;
    }

//    @Autowired
    //  public JavaService(@Qualifier("officeHoursService") ExtraSessions extraSessions, JavaRepository javaRepository) {
    //public JavaService(@Qualifier("MHS") ExtraSessions extraSessions, JavaRepository javaRepository) {
//    public JavaService(@Qualifier("MHS") ExtraSessions extraSessions, JavaRepository javaRepository) {
//        this.extraSessions = extraSessions;
//        this.javaRepository = javaRepository;
//    }


    public void getTeachingHours(){
        System.out.println("Weekly Java Hours: "+(javaRepository.returnHours()+mentoringHours.getHours()+officeHours.getHours()));
    }

}
