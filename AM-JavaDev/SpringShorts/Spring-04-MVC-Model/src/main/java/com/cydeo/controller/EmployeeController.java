package com.cydeo.controller;

import com.cydeo.model.Employee;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ghalipm on 9/14/2023
 * @project SpringShorts
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    public static final  int day=8;
    public static final  int night=5;
    public static final int cycle=day+night;


    // Query Parameter: uri?param=value&param2=value2
    @RequestMapping("/new")  //localhost:8080/employee/new?firstName=Joe
    // to get input/data from UI/user/client to spring or Java site, we need to use @RequestParam
    //public String getInfo(@RequestParam String firstName, Model model){
    public String getInfo(@RequestParam(required = false, defaultValue ="First name not provided!") String firstName, Model model){
        model.addAttribute("first_Name", firstName);
        return "employee-register";
    }

    // Path Parameter:
    @RequestMapping("/add/{firstName}")  //localhost:8080/employee/add/Max
    public String getInfo2(@PathVariable String firstName, Model model){
        model.addAttribute("first_Name", firstName);
        return "employee-register";
    }

    @RequestMapping("/employees")  //localhost:8080/employee/employees could not use "//http://localhost:8080/employees": it is used, so it causes confusion
    public String employees(Model model){

        List<String> headerList=new ArrayList<>();
        headerList.add("D\\E");
        for(int i=0;i<cycle;i++){
            headerList.add("E"+(i+1));
        }
        model.addAttribute("headers",headerList);

        List<String> rows=new ArrayList<>();
        for(int i=0;i<cycle;i++){
            rows.add("Day"+(i+1));
        }
        model.addAttribute("rows",rows);

        List<Employee> employeeList = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            employeeList.add(new Employee(faker.name().firstName(), faker.name().lastName(), faker.job().title(), faker.number().numberBetween(10000, 200000)));
        }
        //DB, API, random data generator can be used for attributeValue.
        model.addAttribute("employees", employeeList);
        return "employee-list";
        // spring recognize employee-list is a html file
    }

    @RequestMapping("/employee-info") //localhost:8080/employee-info
    public String info3(Model model){
        // creating one object from Employee class and assigning values
        Employee employee1=new Employee("Zapaer", "Alip", "CEO",300000);
        model.addAttribute("employee",employee1);

        // attributeName "employee" is needed for the view html file
        return "employee-info";
    }


}
