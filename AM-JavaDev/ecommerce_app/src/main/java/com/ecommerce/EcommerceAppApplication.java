package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceAppApplication.class, args);
    }

//    @Bean
//    public MigrateResult(DataSource dataSource){
//        return Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
//    }


}
