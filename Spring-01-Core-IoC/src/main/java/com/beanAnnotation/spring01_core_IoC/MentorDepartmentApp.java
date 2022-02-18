package com.beanAnnotation.spring01_core_IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MentorDepartmentApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        //PartTimeMentor pt=container.getBean("p2",PartTimeMentor.class );
        PartTimeMentor pt=container.getBean(PartTimeMentor.class );

        ft.createAccount();
        pt.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);
    }
}
