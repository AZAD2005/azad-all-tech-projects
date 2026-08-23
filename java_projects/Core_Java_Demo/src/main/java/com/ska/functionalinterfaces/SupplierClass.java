package com.ska.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierClass {
    public static void main(String[] args) {
       Supplier<String> stringSupplier = () -> "hi i am supplier class...!";
        System.out.println(stringSupplier.get());
    }
}
