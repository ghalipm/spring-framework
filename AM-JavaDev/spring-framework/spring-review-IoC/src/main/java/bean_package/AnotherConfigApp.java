package bean_package;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author ZipZap on 9/2/2023
 * @project spring-framework
 */
@Configuration
public class AnotherConfigApp {

    @Bean("str1")
    public String str1(){
        return "Welcome to Cydeo";
    }

    @Bean
    @Primary
    public String  str2(){
        return "Welcome to Spring Practice";
    }
}
