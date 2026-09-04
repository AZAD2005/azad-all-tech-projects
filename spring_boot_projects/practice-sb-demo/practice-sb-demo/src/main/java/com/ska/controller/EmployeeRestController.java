package com.ska.controller;


import com.ska.entities.EmployeeEntity;
import com.ska.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "/emp")
public class EmployeeRestController {


    @Autowired
    private EmployeeService employeeService;


    @GetMapping(path = "/dummyObject")
    public EmployeeEntity employeeEntity() {
        EmployeeEntity employeeEntity1 = new EmployeeEntity();
        employeeEntity1.setEmpId(1);
        employeeEntity1.setEmpName("azad");
        employeeEntity1.setEmpDoj(new Date());
        return employeeEntity1;
    }

    @GetMapping(path = "/storeEmployee")
    public String storeEmployees(@RequestBody EmployeeEntity empObj){
        empObj.setEmpDoj(new Date());
        return employeeService.storeObj(empObj);
    }

}
