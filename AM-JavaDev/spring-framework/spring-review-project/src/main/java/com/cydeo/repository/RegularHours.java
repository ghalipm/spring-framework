package com.cydeo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/9/2023
 * @project spring-review-project
 */


@Component
@Primary // in the case of more than one bean, either one bean must be @Primary
// or need to use @Qualifier annotation to each bean.
@Qualifier("RH")  //better to have qualifiers even if you do not use them.
public class RegularHours implements HoursRepository{
    @Override
    public int getHours() {
        return 40;
    }
}
