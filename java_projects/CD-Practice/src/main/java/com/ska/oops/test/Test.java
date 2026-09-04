package com.ska.oops.test;

import com.ska.oops.Child;
import com.ska.oops.Parent;

public class Test {
    public static void main(String[] args) {

   Parent parent = new Child();
//        parent.m1();
//        parent.m2();

        Child child = (Child)parent;
        child.m3();
        child.m4();
    }
}
