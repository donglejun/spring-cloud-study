package com.dlj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Security2Start {
    public static void main(String[] args) {
        SpringApplication.run(Security2Start.class,args);
    }
}
