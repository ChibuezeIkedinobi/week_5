package org.week5Assignment.serviceImpl;

import org.week5Assignment.entity.Books;
import org.week5Assignment.entity.Person;
import org.week5Assignment.service.LibraryService;
import org.week5Assignment.util.RoleComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Library implements LibraryService {
    private Map<String, Books> books = new HashMap<>();
    private PriorityQueue<Person> queue = new PriorityQueue<>();

    public Library(Map<String, Books> books, PriorityQueue<Person> queue) {
        this.books = books;
        this.queue = new PriorityQueue<>(new RoleComparator());
    }


    @Override
    public void addBook(String title, int copies) {
        books.put(title, new Books(title, copies));
    }

    @Override
    public void askForBook(Person person, String title) {
        if (books.containsKey(title)) {
            queue.add(person);
            System.out.println(person.getName() + " requested for "+ title);
        } else {
            System.out.println("Book "+ title+ " is not found in the Library");
        }
    }

    @Override
    public void processRequest(String title) {
        Books books1 = books.get(title);
        if (books1 != null) {
            while (!queue.isEmpty() && books1.isAvailable()) {
                Person person = queue.poll();
                books1.borrowBook();
                System.out.println(person+" borrowed "+ title);
            }
            if (!books1.isAvailable()) {
                System.out.println("All copies of "+ title + " have been borrowed");
            }
        }

    }
}
