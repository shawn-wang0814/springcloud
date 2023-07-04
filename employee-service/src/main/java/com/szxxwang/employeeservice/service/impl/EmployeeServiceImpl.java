package com.szxxwang.employeeservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szxxwang.employeeservice.mapper.EmployeeMapper;
import com.szxxwang.employeeservice.pojo.Employee;
import com.szxxwang.employeeservice.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * Project Name:springcloud
 * File Name:null.java
 * Package Name:com.szxxwang.springcloud.service.impl
 * Date:2023/7/2 9:00
 * Copyright (c) 2023, szxxwang@outlook.com All Rights Reserved.
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
