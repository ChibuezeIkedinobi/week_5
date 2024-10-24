package org.hashset.example2.Book;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Book> books = new HashSet<>();

        Book book1 = new Book(1,"Things fall apart", "Chinua Achebe", 20);
        Book book2 = new Book(2,"Purple Hibiscus", "Chimamanda Adichie", 25);
        Book book3 = new Book(3,"Rich dad, Poor Dad", "Robert Kiyosaki", 10);
        Book book4 = new Book(4,"The power of Discipline", "Daniel Walter", 5);
        Book book5 = new Book(5,"Harry Potter", "J.K. Rowling", 15);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book book : books) {
            System.out.println(book);
        }



    }
}
