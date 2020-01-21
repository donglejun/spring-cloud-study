package com.dlj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring-cloud-study-server-eureka启动类
 */
/*spring boot启动的依赖*/
@SpringBootApplication
/*启动eureka服务端*/
@EnableEurekaServer
public class EurekaStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart.class,args);
    }
}
