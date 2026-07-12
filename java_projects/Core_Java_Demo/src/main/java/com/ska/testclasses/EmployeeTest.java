package com.ska.testclasses;

import com.ska.pojoclasses.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Azad",1234,"8179025299");
        Employee employee1 = new Employee("Kamal",1234,"8179025299");
        Employee employee2 = new Employee("Hamdi",1234,"8179025299");


        System.out.println(employee1);
    }
}
