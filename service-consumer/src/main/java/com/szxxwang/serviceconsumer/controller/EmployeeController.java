package com.szxxwang.serviceconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.szxxwang.serviceconsumer.client.EmployeeClient;
import com.szxxwang.serviceconsumer.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Project Name:springcloud
 * File Name:null.java
 * Package Name:com.szxxwang.springcloud.controller
 * Date:2023/7/2 8:46
 * Copyright (c) 2023, szxxwang@outlook.com All Rights Reserved.
 */
@RestController()
@RequestMapping("/consumer")
public class EmployeeController {

//    @Autowired
//    public RestTemplate restTemplate;

    @Autowired
    public DiscoveryClient discoveryClient;


    @Autowired
    public EmployeeClient employeeClient;

    @RequestMapping("/{id}")
    @HystrixCommand
    public String getEmployee(@PathVariable String id){

//        String url = "http://localhost:9090/employee/" + id;
//        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("employee-service");
//        ServiceInstance serviceInstance = serviceInstances.get(0);
//        String url = "http://" + serviceInstance.getHost()+":" + serviceInstance.getPort() + "/employee/" +id;
//        Employee emp = restTemplate.getForObject(url, Employee.class);
//        System.out.println("url:"+url);
//        System.out.println("emp:"+emp.toString());

//        if(id.equals("1")){
//            throw new RuntimeException("服务器繁忙!");
//        }
//
//        String url = "http://employee-service/employee/" + id;
//        String emp = restTemplate.getForObject(url, String.class);
//        System.out.println(emp);

        String emp = employeeClient.queryById(id).toString();
        System.out.println(emp);
        return emp;
    }
}
