package com.feng.bash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = {"com.feng"})
public class BashApplication {

    public static void main(String[] args) {
        SpringApplication.run(BashApplication.class, args);
    }

}
