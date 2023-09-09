package stereotype_annotations.Model;

import org.springframework.stereotype.Component;

/**
 * @author ZipZap on 9/2/2023
 * @project spring-framework
 */
@Component
public class DevOps {
    public void getTotalHours(){
        System.out.println("Total hours: "+ 15);
    }
}
