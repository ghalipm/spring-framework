package com.cydeo.controller;

import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ghalipm on 9/14/2023
 * @project SpringShorts
 */
@Controller
public class MainControllerWithModel {
    @RequestMapping("/employeesList")  //http://localhost:8080/employeesList could not use "//http://localhost:8080/employees": it is used, so it causes confusion
    public String employees(Model model){

        //DB, API, random data generator can be used for attributeValue.
        model.addAttribute("employeeName", "Max");
        return "employee-list";
        //return "employee-list.html";
        // spring recognize employee-list is a html file
    }

    @RequestMapping("/employee-info") //http://localhost:8080/employee-info
    public String info(Model model){
        // creating one object from Employee class and assigning values
        Employee employee1=new Employee("Ziyad", "Alip", 300000);
        model.addAttribute("employee",employee1);
        // attributeName "employee" is needed for the view html file
        return "employee-info";
    }

}
