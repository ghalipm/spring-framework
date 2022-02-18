package streotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IT_School_App {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigCourse.class);
        context.getBean(Selenium.class).getTeachingHours();


    }
}
