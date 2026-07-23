package com.ska;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        OptionalInt min = Arrays.stream(new int[]{1, 2, 3, 4, 56, 5}).max();
        System.out.println(min);

    }
}