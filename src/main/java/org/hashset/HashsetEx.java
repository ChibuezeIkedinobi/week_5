package org.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEx {
    public static void main(String[] args) {

        Set<String> sets = new HashSet<>();

        sets.add("ONE");
        sets.add("TWO");
        sets.add("THREE");
        sets.add("FOUR");
        sets.add("FIVE");
        sets.add("FIVE");

        Iterator<String> iterator = sets.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
