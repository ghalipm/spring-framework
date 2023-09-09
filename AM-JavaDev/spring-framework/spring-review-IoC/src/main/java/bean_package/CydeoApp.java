package bean_package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ZipZap on 9/2/2023
 * @project spring-framework
 */
public class CydeoApp {
    public static void main(String[] args) {
        // creating a spring container
        ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class, String.class);
        FullTimeEmployee fullTimeEmployee=container.getBean(FullTimeEmployee.class);
        fullTimeEmployee.createAccount();

        PartTimeEmployee partTimeEmployee=container.getBean(PartTimeEmployee.class);
        partTimeEmployee.createAccount();

        //String str1=container.getBean("str1", String.class); // without specification of str1 or str2, it gets confused: there are 2 str, not one!
       String strDefault = container.getBean(String.class);
        System.out.println(strDefault);
    }
}
