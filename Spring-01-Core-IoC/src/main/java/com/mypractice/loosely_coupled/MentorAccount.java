package com.mypractice.loosely_coupled;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MentorAccount {
    Mentor mentor;

    public void manageAccount(){
        this.mentor.createAccount();
    }

}
