package com.szxxwang.serviceconsumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project Name:springcloud
 * File Name:null.java
 * Package Name:com.szxxwang.serviceconsumer.config
 * Date:2023/7/4 12:53
 * Copyright (c) 2023, szxxwang@outlook.com All Rights Reserved.
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
