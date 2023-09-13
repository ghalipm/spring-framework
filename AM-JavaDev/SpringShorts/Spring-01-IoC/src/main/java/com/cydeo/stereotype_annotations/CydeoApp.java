package com.cydeo.stereotype_annotations;


import com.cydeo.stereotype_annotations.config.AppConfig;
import com.cydeo.stereotype_annotations.model.DataStructure;
import com.cydeo.stereotype_annotations.model.MicroServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ghalipm on 9/12/2023
 * @project SpringShorts
 */
public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure dsa = container.getBean(DataStructure.class);
        dsa.getTotalHours();

        MicroServices ms = container.getBean(MicroServices.class);
        ms.getTotalHours();
    }
}
