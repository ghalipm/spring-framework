package com.cydeo.multi_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */
@Configuration
public class CarConfig {
    //@Bean
    @Bean("c1")
    //@Primary
    Car car1(){
        Car c=new Car();
        c.setMake("Lexus");
        return c;
    }

    //@Bean
    @Bean("c2")
    Car car2(){
        Car c=new Car();
        c.setMake("Tesla");
        return c;
    }
}
