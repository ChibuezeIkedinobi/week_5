package org.map.Activity5A;

import org.map.Activity5A.model.Book;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Book> bookStore = new HashMap<>();

        Book book1 = new Book(1, "Things fall apart", "Chinua Achebe", 40);
        Book book2 = new Book(2,"Purple Hibiscus", "Chimamanda Adichie", 25);
        Book book3 = new Book(3,"Rich dad, Poor Dad", "Robert Kiyosaki", 10);
        Book book4 = new Book(4,"The power of Discipline", "Daniel Walter", 5);
        Book book5 = new Book(5,"Harry Potter", "J.K. Rowling", 15);

        bookStore.put(1, book1);
        bookStore.put(2, book2);
        bookStore.put(3, book3);
        bookStore.put(4, book4);
        bookStore.put(5, book5);

        for(Map.Entry b : bookStore.entrySet()) {
            System.out.println(b.getKey()+" "+ b.getValue());
        }

    }
}
