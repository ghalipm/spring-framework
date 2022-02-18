package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigCar.class);
        Car car=container.getBean(Car.class);
        Person person=container.getBean(Person.class);

        System.out.println("com.practice.Person name: "+ person.getName());
        System.out.println("com.practice.Car make: "+ car.getMake());
        System.out.println("com.practice.Person's car:"+person.getCar());
    }

}
