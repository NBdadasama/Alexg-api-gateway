package com.alexg.alexggateway;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@EnableDubbo
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class AlexgGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlexgGatewayApplication.class, args);
    }

}
