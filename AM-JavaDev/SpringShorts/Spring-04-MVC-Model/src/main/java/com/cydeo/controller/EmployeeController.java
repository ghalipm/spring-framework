package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ghalipm on 9/14/2023
 * @project SpringShorts
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping("/new")  //http://localhost:8080/employee/new?firstName=Max
    // to get input/data from UI/user/client to spring or Java site, we need to use @RequestParam
    //public String getInfo(@RequestParam String firstName, Model model){
    public String getInfo(@RequestParam(required = false, defaultValue ="First name not provided!") String firstName, Model model){
        model.addAttribute("firstName", firstName);
        return "employee-register";
    }

    @RequestMapping("/add/{firstName}")  //http://localhost:8080/employee/add/Max
    public String getInfo2(@PathVariable String firstName, Model model){
        model.addAttribute("firstName", firstName);
        return "employee-register";
    }
}
