
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patron {

    private String name;
    private List<Book> borrowedBooks;

    public Patron(String name, String id) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public boolean returnBook(String isbn) {
        for (Book book : borrowedBooks) {
            if (book.getISBN().equals(isbn)) {
                borrowedBooks.remove(book);
                book.setBorrowed(false);
                return true;
            }
        }
        return false;
    }
}