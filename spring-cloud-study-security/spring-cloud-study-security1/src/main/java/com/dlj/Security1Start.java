package com.dlj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Security1Start {
    public static void main(String[] args) {
        SpringApplication.run(Security1Start.class,args);
    }
    @RequestMapping("/")
    public Object hello(){
        return "<h1>成功登录系统</h1>";
    }

}
