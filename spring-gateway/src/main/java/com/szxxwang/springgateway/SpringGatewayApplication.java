package com.szxxwang.springgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringGatewayApplication {

    public static void main(String[] args) {
        System.out.println("网关服务开始！");
        SpringApplication.run(SpringGatewayApplication.class, args);
    }

}
