package com.dlj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Security2Start {
    public static void main(String[] args) {
        SpringApplication.run(Security2Start.class, args);
    }

    @RequestMapping("/")
    public Object hello() {
        return "成功登录!";
    }
}
