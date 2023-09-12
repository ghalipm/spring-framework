package com.cydeo.stereotype_annotation_objects_in_other_package;

import com.cydeo.stereotype_annotation_objects_in_the_package.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */
public class CydeoAppOP {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(CourseConfigOP.class);

        JavaOP java = container.getBean(JavaOP.class);
        java.getTeachingHours();

        AgileOP agile = container.getBean(AgileOP.class);
        agile.getTeachingHours();

        Student student = container.getBean(Student.class);
        student.createAccount();

    }


}
