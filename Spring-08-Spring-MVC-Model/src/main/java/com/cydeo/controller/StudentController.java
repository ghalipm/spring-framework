package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject="Collections";
        model.addAttribute("subject", subject);

        //create some random studentId(0-1000)
        Random random=new Random();
        int studentId=random.nextInt();
        model.addAttribute("studentId", studentId);

        // a list
        List<Integer> numbers= Arrays.asList(4, 7, 9, 10);
        model.addAttribute("numbers", numbers);

        Student student=new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);

        return "/student/welcome";
    }

}
