package com.ska.onedcollections;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("azad");
        arrayList.add("azad");
        arrayList.add("azad");
        arrayList.add("kamal");
        arrayList.add("azad");
        arrayList.add("azad");
        arrayList.trimToSize();

        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}
