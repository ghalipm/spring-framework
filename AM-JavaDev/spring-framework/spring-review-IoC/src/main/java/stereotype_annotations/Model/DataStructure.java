package stereotype_annotations.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ZipZap on 9/2/2023
 * @project spring-framework
 */
@Component
@AllArgsConstructor
public class DataStructure {

    @NonNull
    ExtraHours extraHours;
    public DataStructure dataStructure(ExtraHours extraHours){
        return new DataStructure(extraHours);
    }

    public void getTotalHours(){
        System.out.println("Total hours: "+ 40+extraHours.getTotalHours());
    }
}
