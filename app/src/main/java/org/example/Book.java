package org.example;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int yearPublished;
    private boolean isBorrowed;

    // Constructor for initializing all attributes
    public Book(String title, String author, String isbn, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    // Constructor for initializing without borrowing status
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isBorrowed = false; // Default to not borrowed
    }

    // Getters and Setters
    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getISBN() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }
}