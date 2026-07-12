package com.ska.oneDcollections;

import com.ska.pojoclasses.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("azad",1234,"8098909"));
        employeeList.add(new Employee("kamal",6789,"906423"));
        employeeList.add(new Employee("hamdi",9959,"99598852"));
        employeeList.add(new Employee("arafath",4321,"1234596"));

        for (Object object : employeeList){
            System.out.println(object);
        }

    }
}
