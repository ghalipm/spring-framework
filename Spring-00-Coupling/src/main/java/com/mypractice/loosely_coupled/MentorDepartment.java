package com.mypractice.loosely_coupled;

public class MentorDepartment {
    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor=new FullTimeMentor();
        //PartTimeMentor partTimeMentor=new PartTimeMentor();

        // full time mentor account details
        System.out.println("======Full-time account details=====");

        MentorAccount mentorAccount= new MentorAccount(fullTimeMentor);
        mentorAccount.manageAccount();


    }
}
