package com.cydeo.bean_multi_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */

@Configuration
public class AnotherConfigApp {

    @Bean
    String str(){
        return "SpringShort Videos";
    }

    @Bean
    Integer integer(){
        return 100;
    }
}
