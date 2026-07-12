package com.ska.twoDcollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap();
        hashMap.put("kamal",1);
        hashMap.put("azad",2);
        hashMap.put("hamdi",3);
        hashMap.put("hameed",4);
        hashMap.put("arafath",5);

        System.out.println(hashMap.get("azad"));
        }

    }

