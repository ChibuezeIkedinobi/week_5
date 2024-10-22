package org.distribution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Segun", 50);
        Person person2 = new Person("Simon", 20);
        Person person3 = new Person("Jane", 35);
        Person person4 = new Person("Charlie", 25);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        Collections.sort(people, new AgeComparator());

        for (Person persons : people) {
            System.out.println(persons.getName() + " - " + persons.getAge());
        }

    }
}
