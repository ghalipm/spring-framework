package com.cydeo.repository;

import com.cydeo.model.Employee;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/9/2023
 * @project spring-framework
 */
@Component
public class DBEmployeeRepository implements EmployeeRepository{

    //Assume we are getting this data from the db
    @Override
    public int getHourlyRate() {
        Employee employee = new Employee("Harold Finch","IT",65);

        return employee.getHourlyRate();
    }
}