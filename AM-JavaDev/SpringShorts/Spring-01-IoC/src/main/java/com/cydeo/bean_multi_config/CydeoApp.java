package com.cydeo.bean_multi_config;

import com.cydeo.bean_annotation.FullTimeMentor;
import com.cydeo.bean_annotation.PartTimeMentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */
public class CydeoApp {

    public static void main(String[] args) {
        //System.out.println("===============Creating Mentors with Beans========");
        // create container and tell which config class managers the beans
        //ApplicationContext container=new AnnotationConfigApplicationContext(ConfigApp.class);
        //Before there was only one ConfigApp class

        System.out.println("===============Creating Mentors with Beans and Multiple ConfigApp classes========");

        // multiple ConfigApp classes can be added to ApplicationContext container
        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigAppMB.class, AnotherConfigApp.class);

        FullTimeMentor ftm = container.getBean(FullTimeMentor.class);
        ftm.createAccount();

        PartTimeMentor ptm = container.getBean(PartTimeMentor.class);
        ptm.createAccount();

        String str = container.getBean(String.class);
        System.out.println("String Bean is created: "+str);

        Integer integer=container.getBean(Integer.class);
        System.out.println("Integer Bean is created: "+integer);


    }


}
