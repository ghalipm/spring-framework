package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/9/2023
 * @project spring-framework
 */
@Component
public class OverTimeSalaryService {

    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;

    public OverTimeSalaryService(EmployeeRepository employeeRepository, @Qualifier("OTH") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateOverTimeSalary(){
        System.out.println(hoursRepository.getHours()*employeeRepository.getHourlyRate());
    }
}