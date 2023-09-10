package stereotype_annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.Config.AppConfig;

/**
 * @author ZipZap on 9/2/2023
 * @project spring-framework
 */

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
