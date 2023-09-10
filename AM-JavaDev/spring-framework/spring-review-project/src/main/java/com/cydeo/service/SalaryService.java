package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.stereotype.Component;

/**
 *  @author ghalipm on 9/9/2023
 * @project spring-review-project
 */
@Component
public class SalaryService {
// SalaryService  could have been RegularHoursSalaryService
    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;
// Since, RegularHours bean is primary bean due to @Primary annotation,
// for HoursRepository by default RegularHours is used or one can use @Qualifier("RH")
    // if neither @Primary nor @Qualifier is used for SalaryService, then we get error:
    // compiler does not know which bean to use.

    //public SalaryService(EmployeeRepository employeeRepository,@Qualifier("RH") HoursRepository hoursRepository) {
    public SalaryService(EmployeeRepository employeeRepository, HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){
        //HourlyRate * Regular Hours
        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());
    }
}
