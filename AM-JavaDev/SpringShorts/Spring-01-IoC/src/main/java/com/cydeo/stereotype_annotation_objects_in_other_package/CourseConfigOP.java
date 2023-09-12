package com.cydeo.stereotype_annotation_objects_in_other_package;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ghalipm on 9/11/2023
 * @project SpringShorts
 */
@Configuration
//@ComponentScan(basePackages = "com.cydeo")
// 1. basePackage should not be nested: basePackage has child packages, but not grand children packages
// 2. Same class names in other packages causes problems
@ComponentScan(basePackages = "com.cydeo")
public class CourseConfigOP {

}
