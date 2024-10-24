package org.map.Activity5A.model;

public class Book {
    private int id;
    private String title;
    private String Author;
    private int quantity;

    public Book(int id, String title, String author, int quantity) {
        this.id = id;
        this.title = title;
        Author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book id: "+ getId()+", Title: "+getTitle() +", Author: "+ getAuthor()+ ", Quantity: "+ getQuantity();
    }
}
