package com.cydeo.stereotype_annotation_objects_in_the_package;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */
@Configuration
@ComponentScan // only inside current package
public class CourseConfigSP {

}
