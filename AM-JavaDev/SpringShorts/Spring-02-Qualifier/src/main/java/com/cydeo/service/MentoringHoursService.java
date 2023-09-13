package com.cydeo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/13/2023
 * @project SpringShorts
 */
@Component
@Qualifier("MHS")
public class MentoringHoursService implements ExtraSessions{
    @Override
    public int getHours() {
        return 8;
    }
}
