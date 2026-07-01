package org.ska;

import java.util.function.*;

public class App {
    public static void main(String[] args) {

       BiFunction<Integer,Integer,Integer> biFunction = (a,b) ->{
            return a + b;
        };
        System.out.println(biFunction.apply(2,12));


       BinaryOperator<String> binaryOperator =  (x,y) ->{
           return String.format("Hii my name is: %s and i am from: %s",x,y);
        };
        System.out.println(binaryOperator.apply("azad","makkinavarigudem"));
    }


}
