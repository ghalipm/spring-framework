package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {
    @RequestMapping("/mentor")
    public String showMentor(Model model){

        List<Mentor> mentorList=new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        mentorList.add(new Mentor("Tom", "Hanks", 65, Gender.MALE));
        mentorList.add(new Mentor("Amy", "Brian", 25, Gender.FEMALE));

        Mentor mentor=new Mentor("Flinta", "Ozzy", 35, Gender.MALE);

        model.addAttribute("mentors", mentorList);
        model.addAttribute("mentor", mentor);

        return "mentor-list";
    }
}
