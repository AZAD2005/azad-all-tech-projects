package com.ska.streams;

import com.ska.pojoclasses.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");

        Stream<String> emptyStream = Stream.empty();

        System.out.println(emptyStream.count());

//Output : 0

    }

}
