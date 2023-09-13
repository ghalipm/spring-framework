package com.cydeo.bean_annotation;

/*
  @author ghalipm on 9/11/2023
 * @project Spring-Shorts
 */

/**
 * TASK 1:
 *     1-create new module spring-review-IoC
 *     2-Add spring core dependency
 *     3-create one package named bean_practice
 *     4-Create 2 classes
 *         -FullTimeEmployee
 *         -PartTimeEmployee
 *     5-Create one method for each class createAccount() -print something (void)
 *     6-get beans using spring core @Bean annotation
 *     ----------
 *     7-we need two String objects
 *         "Welcome to CydeoApp"
 *         "Spring Core Practice"
 *     8-print those two objects in the same project.(with new config file)
 */

public class FullTimeMentor {
    public void createAccount(){
        System.out.println("Full time mentor is created");
    }
}
