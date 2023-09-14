package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.service.JavaService;
import com.cydeo.service.JavaService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ghalipm on 9/13/2023
 * @project SpringShorts
 */
public class CydeoApp2 {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigApp.class);

        JavaService2 java1=container.getBean(JavaService2.class);
        JavaService2 java2=container.getBean(JavaService2.class);
        System.out.println("java1 = " + java1);
        System.out.println("java2 = " + java2);
        // container creates only one single object.
        // with @Scope annotation at JavaService class,
        // one gets different bean/object each time bean is retrieved

        System.out.println(java1 == java2);

    }
}