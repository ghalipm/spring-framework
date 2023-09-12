package com.cydeo.stereotype_annotation_objects_in_the_package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */
public class CydeoAppSP {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(CourseConfigSP.class);

        Java java=container.getBean(Java.class);
        java.getTeachingHours();

        Agile agile = container.getBean(Agile.class);
        agile.getTeachingHours();

        Student student = container.getBean(Student.class);
        student.createAccount();


    }

}
