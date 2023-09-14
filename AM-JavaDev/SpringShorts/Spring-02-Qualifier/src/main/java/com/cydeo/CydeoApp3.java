package com.cydeo;

import com.cydeo.config.ConfigApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ghalipm on 9/13/2023
 * @project SpringShorts
 */
public class CydeoApp3 {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);
// JavaService3 constructor is not called, but if we run the main,
// JavaService3 constructor is already initialized (Eager initialization by default)

    }

}
