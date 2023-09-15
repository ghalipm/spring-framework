package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ghalipm on 9/14/2023
 * @project SpringShorts
 */
@Controller
public class MainController {
    @RequestMapping("/employees")
    public String employees(){
        return "employee-list";
        // spring recognize employee-list is a html file
    }
}
