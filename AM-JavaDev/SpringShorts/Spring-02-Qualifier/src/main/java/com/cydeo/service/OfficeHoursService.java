package com.cydeo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/12/2023
 * @project SpringShorts
 */
@Qualifier("OHS")
@Component
public class OfficeHoursService implements ExtraSessions{

    @Override
    public int getHours() {
        return 5;
    }
}
