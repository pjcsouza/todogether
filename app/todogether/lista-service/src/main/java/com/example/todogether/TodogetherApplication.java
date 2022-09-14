package com.example.todogether;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TodogetherApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodogetherApplication.class, args);
    }

}
