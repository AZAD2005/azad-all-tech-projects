package com.ska.implementclasses;

import com.ska.interfaces.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("contract")
public class ContractEmployee implements IEmployee {

    public void employeeType() {
        System.out.println("EmpType is :ContractEmployee...!");
    }
}
