package com.ska.implementclasses;

import com.ska.interfaces.IEmployee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("permanent")
public class PermanentEmployee implements IEmployee {
    public void employeeType(){
        System.out.println("EmpType is : PermanentEmployee...!");
    }
}
