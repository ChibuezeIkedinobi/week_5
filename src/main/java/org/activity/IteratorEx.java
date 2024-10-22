package org.activity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {

        ArrayList<String> cityName = new ArrayList<>();

        cityName.add("Benin");
        cityName.add("Lagos");
        cityName.add("Jos");
        cityName.add("Anambra");
        cityName.add("Kaduna");

        Iterator<String> iterator = cityName.iterator();

        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.print(city+", ");
        }
    }
}
