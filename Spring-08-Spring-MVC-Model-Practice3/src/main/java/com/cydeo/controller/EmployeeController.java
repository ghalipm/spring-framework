package com.cydeo.controller;

import com.cydeo.enums.Department;
import com.cydeo.enums.Gender;
import com.cydeo.enums.Role;
import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    @RequestMapping("/employee")
    public String showEmployee(Model model){ // localhost:8080/employee
        List<Employee> eList=new ArrayList<>();

        eList.add(new Employee(101L,"Mike", "Smith", Gender.M, 25, Department.HR,  Role.EMP, 6000.0, 3.5));
        eList.add(new Employee(102L,"John", "Doe", Gender.M, 35,Department.SE,  Role.EMP, 7000.0, 4.5));
        eList.add(new Employee(103L,"Jack", "Harris", Gender.M, 55,Department.DEV,  Role.CEO, 9000.0, 5.0));
        eList.add(new Employee(104L,"Mikey", "Smith", Gender.M, 52,Department.DEV,  Role.MGR, 8000.0, 4.0));
        eList.add(new Employee(105L,"Masha", "Pushkinova", Gender.F, 45,Department.DEV,  Role.EMP, 7000.0, 3.5));
        eList.add(new Employee(106L,"Molly", "Johnson", Gender.F, 19,Department.QA,  Role.INTERN, 5500.0, 1.5));
        eList.add(new Employee(107L,"Penny", "Jackson", Gender.F, 24,Department.QA,  Role.INTERN, 5000.0, 0.5));
        model.addAttribute("employees", eList);
        return "/employee/employee-info";
    }
}
