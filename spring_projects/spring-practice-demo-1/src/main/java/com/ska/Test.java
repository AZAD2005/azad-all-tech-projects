package com.ska;

import com.ska.implementclasses.ContractEmployee;
import com.ska.implementclasses.PermanentEmployee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.ska");
        context.refresh();

        EmployeeService service = context.getBean(EmployeeService.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("======Employee Menu======");
        System.out.println("1. Permanent Employee");
        System.out.println("2. Contrtact Employee");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        service.employeework(choice);

        sc.close();


    }
}
