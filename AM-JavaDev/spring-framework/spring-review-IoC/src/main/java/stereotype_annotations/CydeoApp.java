package stereotype_annotations;


/**
 * @author ZipZap on 9/2/2023
 * @project spring-framework
 */

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
