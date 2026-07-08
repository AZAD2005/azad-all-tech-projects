package com.ska;

import com.ska.implementclasses.MyCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        MyCalculator myCalculator = new MyCalculator();
        int add = myCalculator.add(a,b);
        System.out.println(add);

        sc.close();

    }
    }
