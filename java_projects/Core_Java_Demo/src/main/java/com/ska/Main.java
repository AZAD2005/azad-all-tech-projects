package com.ska;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {

        OptionalInt reduce = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}).max();

        System.out.println(reduce.getAsInt());

    }
}