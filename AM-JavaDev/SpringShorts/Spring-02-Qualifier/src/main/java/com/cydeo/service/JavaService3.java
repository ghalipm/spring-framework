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
@Lazy  // with @Lazy annotation,
// JavaService3 constructor will not initialize
// - beans will not be initialized, until it is called
@Component
public class JavaService3 {
    private final ExtraSessions officeHours;
    private final ExtraSessions mentoringHours;
    private final JavaRepository javaRepository;

    @Autowired
    public JavaService3(@Qualifier("OHS") ExtraSessions officeHours, @Qualifier("MHS") ExtraSessions mentoringHours, JavaRepository javaRepository) {
        this.officeHours = officeHours;
        this.mentoringHours = mentoringHours;
        this.javaRepository = javaRepository;
        System.out.println("Eager Test - JavaService3 constructor");
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
