package bean_package;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZipZap on 9/2/2023
 * @project spring-framework
 */
@Configuration
public class AppConfig {
    @Bean
    public FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }
    @Bean
    public PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }
}
