package com.cydeo.without_bean;

/**
 * @author ghalipm on 9/11/2023
 * @project Spring-Shorts
 */
public class CydeoApp {

    public static void main(String[] args) {
        System.out.println("===============Creating Mentors old way: without Beans========");

        FullTimeMentor fullTimeMentor=new FullTimeMentor();
        PartTimeMentor partTimeMentor=new PartTimeMentor();
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }


}
