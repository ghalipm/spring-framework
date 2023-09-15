package stereotype_annotations.Model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ghalipm on 9/10/2023
 * @project spring-framework
 */
@Component
@Data
public class DataStructure {

    @NonNull
    ExtraHours extraHours;

    //@Autowired
    public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    public void getTotalHours(){
        System.out.println(" DS Total hours: "+(40+extraHours.getHours()));
    }
}
