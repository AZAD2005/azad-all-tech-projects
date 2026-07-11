package com.ska.implementclasses;

import com.ska.interfaces.ICalculator;

public class MyCalculator implements ICalculator {
    @Override
    public int add(Integer a, Integer b) {
        System.out.println("add() Method...!");
       int result = a + b ;
       return result;
    }
}
