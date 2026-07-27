package com.ska;

import com.ska.interfaces.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Autowired
    @Qualifier("permanent")
    private IEmployee permanentemployee;

    @Autowired
    @Qualifier("contract")
    private IEmployee contractemployee;

    public void employeework(int choice) {
        if (choice == 1) {
            permanentemployee.employeeType();
        } else if (choice == 2){
            contractemployee.employeeType();
        }else
            System.out.println("Invalid choice");
    }
}

