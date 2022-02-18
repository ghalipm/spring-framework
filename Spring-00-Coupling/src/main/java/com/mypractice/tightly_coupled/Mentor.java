package com.mypractice.tightly_coupled;

public class Mentor {

    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    //MI
    // constructor is defined for both ft and pt: tightly coupled
    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) { //MI
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    // method is also does two things at one time.
    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
        //MI
    }

}
