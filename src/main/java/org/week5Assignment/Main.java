package org.week5Assignment;

import org.week5Assignment.entity.Books;
import org.week5Assignment.entity.Person;
import org.week5Assignment.enums.Role;
import org.week5Assignment.serviceImpl.Library;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        Map<String, Books > books = new HashMap<>();
        PriorityQueue<Person> queue = new PriorityQueue<>();

        Library library = new Library(books, queue);
        library.addBook("Things Fall Apart", 1);
        library.addBook("Purple Hibiscus", 2);

        Person segun = new Person("Segun", Role.TEACHER);
        Person muminat = new Person("Muminat", Role.STUDENT);
        Person simon = new Person("Simon", Role.STUDENT);

        library.askForBook(simon, "Things Fall Apart");
        library.askForBook(muminat, "Things Fall Apart");
        library.processRequest("Things Fall Apart");
        System.out.println();

        library.askForBook(muminat, "Purple Hibiscus");
        library.askForBook(simon, "Purple Hibiscus");
        library.askForBook(segun, "Purple Hibiscus");
        System.out.println();

        library.processRequest("Purple Hibiscus");
        System.out.println();

        library.askForBook(muminat, "Things Fall Apart");
        library.processRequest("Things Fall Apart");



    }
}
