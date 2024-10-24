package org.week5Assignment.service;

import org.week5Assignment.entity.Person;

public interface LibraryService {

    void addBook(String title, int copies);

    void askForBook(Person person, String title);

    void processRequest(String title);
}
