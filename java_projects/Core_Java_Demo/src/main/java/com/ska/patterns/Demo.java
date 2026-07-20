package com.ska.patterns;

public class Demo {

    public static void printTrianglePattern(int rows ){

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printTrianglePattern(10);
    }

}
