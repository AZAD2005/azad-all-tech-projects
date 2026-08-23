package com.ska.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {
    Predicate<Integer> predicate = n -> n % 2 == 0 ;

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(11));


    }

}
