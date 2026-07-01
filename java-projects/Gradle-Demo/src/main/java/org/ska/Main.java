package org.ska;

import org.ska.interfaces.AnimalInterface;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //predicate
        Predicate<Integer> integerPredicate = marks -> marks >= 60;
        System.out.println(integerPredicate.test(61));
        System.out.println(integerPredicate.test(20));

        //Consumer
        Consumer<String> print = name -> System.out.println("Hello " + name);
        print.accept("Azadsk");

        //Function
        Function<String, Integer> f = x -> {
            return x.length();
        };
        System.out.println(f.apply("azadakjfbadnfksdfnozsg"));


        //Supplier
        Supplier<String> stringSupplier = () -> "Welcome to supplier";
        System.out.println(stringSupplier.get());


        //BiPredicate
        BiPredicate<Integer, Integer> check = (a, b) -> a > b;
        System.out.println(check.test(20, 10));


        //BiConsumer
        BiConsumer<String, Integer> student = (name, id) -> System.out.println(name + " : " + id);
        student.accept("Azad", 101);


        //BiFunction
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 20));
    }

    ;
}






