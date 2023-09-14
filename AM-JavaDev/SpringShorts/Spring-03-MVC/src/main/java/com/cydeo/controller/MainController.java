package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ghalipm on 9/14/2023
 * @project SpringShorts
 */
@Controller
public class MainController {
@RequestMapping("/") // http://localhost:8080/
    public String home(){
        return "home.html";  // home.html has to be available in static folder
    }
    @RequestMapping("/welcome")  //http://localhost:8080/welcome
    public String welcome(){
        return "welcome.html";
    }
    @RequestMapping("/employees") // http://localhost:8080/employees
    public String employees(){
        return "employees.html";
    }
}
