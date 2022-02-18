package com.mypractice.loosely_coupled;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor Account is breing created...");
    }
}

// if project show orange or red:
// right click on the pom.xml file -> add as maven project