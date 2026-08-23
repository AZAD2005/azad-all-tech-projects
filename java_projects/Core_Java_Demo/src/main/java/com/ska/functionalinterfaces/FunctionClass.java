package com.ska.functionalinterfaces;

import java.util.function.Function;

public class FunctionClass {
    public static void main(String[] args) {
       Function<Integer,String> convert =  a -> "Number is " + a;

        String s = convert.apply(123);
        System.out.println(s);
    }
}
