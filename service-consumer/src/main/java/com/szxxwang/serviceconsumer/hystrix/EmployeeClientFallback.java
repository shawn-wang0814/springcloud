package com.szxxwang.serviceconsumer.hystrix;

import com.szxxwang.serviceconsumer.client.EmployeeClient;
import org.springframework.stereotype.Component;

/**
 * Project Name:springcloud
 * File Name:null.java
 * Package Name:com.szxxwang.serviceconsumer.hystrix
 * Date:2023/7/4 12:20
 * Copyright (c) 2023, szxxwang@outlook.com All Rights Reserved.
 */
@Component
public class EmployeeClientFallback implements EmployeeClient{
    @Override
    public String queryById(String id) {
        System.out.println("服务器发生熔断时才执行此方法，说明此时服务器发生熔断!");
        return "网络拥堵，服务熔断!";


    }
}
