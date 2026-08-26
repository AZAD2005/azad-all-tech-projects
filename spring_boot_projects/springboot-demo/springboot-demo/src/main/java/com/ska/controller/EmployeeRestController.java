package com.ska.controller;


import com.ska.entities.EmployeeEntity;
import com.ska.models.EmployeeVO;
import com.ska.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Set;

@RestController
public class EmployeeRestController {

@Autowired
private EmployeeService employeeService;

    @GetMapping(path = "/entityDummy")
    public EmployeeEntity entityDummy(){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmpId(1);
        employeeEntity.setEmpName("azad");
        employeeEntity.setEmpDoj(new Date());
        employeeEntity.setEmpSalary(32424d);
        return employeeEntity;
    }

    @PostMapping(path = "/storeEmployee")
    public String storeEmployee(@RequestBody EmployeeEntity employeeObj){
//        employeeObj.setEmpDoj(new Date());
        return employeeService.storeEmployee(employeeObj);

    }
    @GetMapping("/fetchAllEmployees")
    public Set<EmployeeVO> fetchAllEmployees(){
        return  employeeService.fetchAllEmployees();
    }

}
