package com.cydeo.bean_multi_config;

import com.cydeo.bean_annotation.FullTimeMentor;
import com.cydeo.bean_annotation.PartTimeMentor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ghalipm on 9/11/2023
 * @project Spring-Shorts
 */

@Configuration
public class ConfigApp {

    // create method and label with @Bean
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }
    @Bean
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

}
