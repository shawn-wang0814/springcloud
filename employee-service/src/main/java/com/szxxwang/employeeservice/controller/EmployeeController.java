package com.szxxwang.employeeservice.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.szxxwang.employeeservice.pojo.Employee;
import com.szxxwang.employeeservice.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name:springcloud
 * File Name:null.java
 * Package Name:com.szxxwang.springcloud.controller
 * Date:2023/7/2 8:46
 * Copyright (c) 2023, szxxwang@outlook.com All Rights Reserved.
 */
@RestController()
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    public EmployeeServiceImpl employeeService;

    @RequestMapping("/{id}")
//    @HystrixCommand(defaultFallback = "defaultFallBackMethod")
//    @HystrixCommand
    public String getEmployee(@PathVariable String id){

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        int eid = Integer.parseInt(id);
        QueryWrapper<Employee> objectQueryWrapper = new QueryWrapper<>();
        QueryWrapper<Employee> queryWrapper = objectQueryWrapper.eq("id", eid);
        Employee employee = employeeService.getOne(queryWrapper);
        return employee.toString();
    }

    public String defaultFallBackMethod(){
        return "网络拥堵!";
    }

}
