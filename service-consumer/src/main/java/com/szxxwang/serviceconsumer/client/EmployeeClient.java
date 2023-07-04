package com.szxxwang.serviceconsumer.client;

import com.szxxwang.serviceconsumer.config.FeignConfig;
import com.szxxwang.serviceconsumer.hystrix.EmployeeClientFallback;
import com.szxxwang.serviceconsumer.pojo.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project Name:springcloud
 * File Name:null.java
 * Package Name:com.szxxwang.serviceconsumer
 * Date:2023/7/4 10:48
 * Copyright (c) 2023, szxxwang@outlook.com All Rights Reserved.
 */
@FeignClient(name = "employee-service",fallback = EmployeeClientFallback.class,configuration = FeignConfig.class)
public interface EmployeeClient {
    @GetMapping("/employee/{id}")
    String queryById(@PathVariable("id") String id);
}
