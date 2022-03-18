package com.cydeo.controller;

import com.cydeo.enums.Contract;
import com.cydeo.enums.Gender;
import com.cydeo.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @RequestMapping("/details")  // http://localhost:8080/teacher/details
    public String showTeacher(Model model){
        List<Teacher> teacherList=new ArrayList<>();

        teacherList.add(new Teacher("Mike", "Smith", Gender.MALE, 45, BigDecimal.valueOf(8000), Contract.FT));
        teacherList.add(new Teacher("Miky", "Sandyman", Gender.FEMALE, 35, BigDecimal.valueOf(7000), Contract.PT));
        teacherList.add(new Teacher("Micheal", "Jacobson", Gender.MALE, 51, BigDecimal.valueOf(8500), Contract.FT));
        teacherList.add(new Teacher("Sasha", "Smiley", Gender.FEMALE, 24, BigDecimal.valueOf(5000), Contract.PT));
        teacherList.add(new Teacher("Mary", "Sandman", Gender.FEMALE, 25, BigDecimal.valueOf(6000), Contract.PT));
        teacherList.add(new Teacher("Jolie", "Pattern", Gender.FEMALE, 56, BigDecimal.valueOf(9000), Contract.FT));
        teacherList.add(new Teacher("Mike", "Tython", Gender.MALE, 55, BigDecimal.valueOf(8000), Contract.FT));

        model.addAttribute("teachers", teacherList);

        return "/teacher/teacher_info";
    }

}
