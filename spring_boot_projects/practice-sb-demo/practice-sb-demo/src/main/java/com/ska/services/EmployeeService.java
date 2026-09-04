package com.ska.services;

import com.ska.entities.EmployeeEntity;
import com.ska.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public String storeObj(EmployeeEntity employeeObj){
        employeeRepository.save(employeeObj);
        return "Employee Stored Successfully with the Name : " + employeeObj.getEmpName();
    }
}
