package com.szxxwang.employeeservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szxxwang.employeeservice.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Project Name:springcloud
 * File Name:null.java
 * Package Name:com.szxxwang.springcloud.mapper
 * Date:2023/7/2 8:47
 * Copyright (c) 2023, szxxwang@outlook.com All Rights Reserved.
 */

@Mapper
@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {
}
