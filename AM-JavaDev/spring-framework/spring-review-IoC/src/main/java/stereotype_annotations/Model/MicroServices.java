package stereotype_annotations.Model;

import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/2/2023
 * @project spring-review-IoC
 */
@Component
public class MicroServices {
    public void getTotalHours(){

        System.out.println("Total hours:"+25);
    }

}
