package org.map.Activity4A;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        Map<Integer, String> fruits = new HashMap<>();

        fruits.put(1, "Mango");
        fruits.put(2, "Apples");
        fruits.put(3, "Cherry");
        fruits.put(4, "Berry");
        fruits.put(5, "Kiwi");
        fruits.put(6, "Orange");

        for (Map.Entry f: fruits.entrySet()) {
            System.out.println(f.getKey()+ ". "+ f.getValue());
        }
    }
}
