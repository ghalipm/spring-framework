package com.cydeo.stereotype_annotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ghalipm on 9/12/2023
 * @project SpringShorts
 */
@Configuration
//@ComponentScan(basePackages = "com.cydeo")
@ComponentScan(basePackages = "com.cydeo.stereotype_annotations")

// for basePackages, better everything from Java to just one level above the Config file has to be provided.
public class AppConfig {
}
