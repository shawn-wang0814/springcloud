package com.szxxwang.employeeservice.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * Project Name:springcloud
 * File Name:null.java
 * Package Name:com.szxxwang.springcloud.pojo
 * Date:2023/7/2 8:22
 * Copyright (c) 2023, szxxwang@outlook.com All Rights Reserved.
 */
@Data
@TableName("employees")
public class Employee {
    int id;
    String serialNumber;
    String employeeName;
    int gender;
    String dp;
    Date joinDate;
    int lastYearRemainingDay;
    int thisYearRemainingDay;
    Date retireDate;
    @TableField("yearOfService")
    int yearsOfService;
}
