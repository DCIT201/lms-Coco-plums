package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public boolean borrowBook(String isbn, String patronName) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn) && !book.isBorrowed()) {
                for (Patron patron : patrons) {
                    if (patron.getName().equals(patronName)) {
                        book.setBorrowed(true);
                        patron.borrowBook(book);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean returnBook(String isbn, String patronName) {
        for (Patron patron : patrons) {
            if (patron.getName().equals(patronName)) {
                return patron.returnBook(isbn);
            }
        }
        return false;
    }
}