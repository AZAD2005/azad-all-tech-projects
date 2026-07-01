package com.skb.basics;

public class Student {
    String name;
    Integer id;

    public Student() {
    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public static String m1(String name) {
        return name;
    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Id:" + id);
    }

    public String fetchDetails() {
        return String.format("My Name is : %s and id is : %d", name, id);
    }

    public int finalSalary(int salary) {
        int finalSalary = salary + 2000;
        // 1000
        return finalSalary;

    }

    public String getName() {
        return this.name;
    }
}
