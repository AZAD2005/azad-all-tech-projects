package com.ska;

public class App {

    String name;
    static String name1 = "Azad sk";

    public App(){
        System.out.println("Hii i am Constructor...!");
    }

    public App(String name){
        this.name = name;
    }

    public void m1(){
        System.out.println("m1() method....!");
    }

    public static void m2(String ename, Integer id){
        System.out.println(ename + "--" + id);
//        return false;
    }

}
