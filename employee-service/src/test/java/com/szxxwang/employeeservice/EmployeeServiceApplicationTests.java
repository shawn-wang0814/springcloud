package com.szxxwang.employeeservice;

import com.szxxwang.employeeservice.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class EmployeeServiceApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void testRestTemplate(){
        String url = "http://localhost:8080/employee/22";
        Employee forObject = restTemplate.getForObject(url, Employee.class);
        System.out.println("employee:"+forObject);
    }

}
