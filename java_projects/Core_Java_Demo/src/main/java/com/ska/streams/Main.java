package com.ska.streams;

import com.ska.pojoclasses.Employee;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(integerStream.count());
    }
}