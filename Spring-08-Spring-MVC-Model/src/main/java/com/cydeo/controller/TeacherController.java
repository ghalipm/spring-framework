package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {
    @RequestMapping("/welcomeTeacher")
    public String teacherHomePage(Model model){
        model.addAttribute("message", "Hello, ");
        model.addAttribute("teacherName", "Ozzy!");
        return "/teacher/welcomeTeacher";
    }
}
