package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.service.JavaService2;
import com.cydeo.service.JavaService4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ghalipm on 9/13/2023
 * @project SpringShorts
 */
public class CydeoApp4 {

    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigApp.class);

        JavaService4 java=container.getBean(JavaService4.class);
        java.getTeachingHours();

        // only when the constructor is called,
        // then bean is initialized with @Lazy annotation

    }
}
