package stereotype_annotations.Model;

import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/10/2023
 * @project spring-framework
 */
@Component
public class MicroServices {
    public void getTotalHours(){
        System.out.println("MS Total hours: "+25);
    }
}
