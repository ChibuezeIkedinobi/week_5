package org.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week5Assessment {
    public static void main(String[] args) {

        Map<Integer, String> fruits = new HashMap<>();

        fruits.put(1,"Mango");
        fruits.put(2,"Orange");
        fruits.put(3,"Apple");
        fruits.put(4,"Kiwi");
        fruits.put(5, "Avocado");

        for (Map.Entry<Integer, String> fruit : fruits.entrySet()) {
            System.out.println(fruit.getKey()+" - "+fruit.getValue());
        }
    }
}
