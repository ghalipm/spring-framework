package stereotype_annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.Config.AppConfig;
import stereotype_annotations.Model.DataStructure;
import stereotype_annotations.Model.DevOps;
import stereotype_annotations.Model.ExtraHours;
import stereotype_annotations.Model.MicroServices;

/**
 * @author ZipZap on 9/2/2023
 * @project spring-framework
 */

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure dsa = container.getBean(DataStructure.class);
        dsa.getTotalHours();

        MicroServices ms = container.getBean(MicroServices.class);
        ms.getTotalHours();

        DevOps devOps=container.getBean(DevOps.class);
        devOps.getTotalHours();

        ExtraHours eh = container.getBean(ExtraHours.class);
        System.out.println("ExtraHours: "+eh.getHours());
    }
}
