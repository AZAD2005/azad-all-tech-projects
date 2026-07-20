package com.ska.patterns;

public class MinValue {
    public static void main(String[] args) {
        int[] my_array = {23,4,56,77,88,99,10,6,9,1,2,3,4,5};
        int minVal = my_array[0];

        for (int i : my_array){
            if (i < minVal){
                minVal = i ;
            };
        }
        System.out.println("Minimum Value is:" + minVal);
    }
}


//{23,4,56,77,88,99,10,6,9,1,2,3,4,5};
