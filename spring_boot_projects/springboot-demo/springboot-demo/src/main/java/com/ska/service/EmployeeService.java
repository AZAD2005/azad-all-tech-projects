package com.ska.service;

import com.ska.entities.EmployeeEntity;
import com.ska.models.EmployeeVO;
import com.ska.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Set;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeVO dummyObject(){
        return new EmployeeVO(1,"AZAD Shaik", new Date(),12122d, true);
    }

    public String storeEmployee(EmployeeEntity employeeObj){
        employeeRepository.save(employeeObj);
        return "Employee Stored successfully with the name: "+ employeeObj.getEmpName();
    }

    public Set<EmployeeVO> fetchAllEmployees(){
        return  null;
    }

}
