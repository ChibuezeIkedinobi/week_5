package org.week5Assignment.entity;

public class Books {
    private String title;
    private int copies;

    public Books(String title, int copies) {
        this.title = title;
        this.copies = copies;
    }

    public Books() {
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public void borrowBook() {
        if (copies > 0) {
            copies--;
        }
    }

    public void returnBook() {
        copies++;
    }

    public boolean isAvailable() {
        return copies > 0;
    }
}
