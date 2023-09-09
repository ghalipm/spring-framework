package com.cydeo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/9/2023
 * @project spring-framework
 */


@Component
@Primary
@Qualifier("RH")
public class RegularHours implements HoursRepository{
    @Override
    public int getHours() {
        return 40;
    }
}
