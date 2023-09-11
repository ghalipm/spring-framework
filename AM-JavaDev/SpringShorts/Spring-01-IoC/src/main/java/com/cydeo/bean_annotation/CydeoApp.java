package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */
public class CydeoApp {

    public static void main(String[] args) {
        System.out.println("===============Creating Mentors with Beans========");
        // create container and tell which config class managers the beans
        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigApp.class);

        FullTimeMentor ftm = container.getBean(FullTimeMentor.class);
        ftm.createAccount();

        PartTimeMentor ptm = container.getBean(PartTimeMentor.class);
        ptm.createAccount();

    }


}
