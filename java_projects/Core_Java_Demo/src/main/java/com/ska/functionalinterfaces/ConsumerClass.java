package com.ska.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        Consumer<String> consumer = a -> System.out.println(a);

        consumer.accept("kamal");
    }

}
