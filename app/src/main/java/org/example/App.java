/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        org.example.Library library = new org.example.Library();

        // Add books
        Book book1 = new Book("1984", "George Orwell", "123456789", false);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321", false);
        library.addBook(book1);
        library.addBook(book2);

        // Register patrons
        Patron patron1 = new Patron("Alice", "P001");
        Patron patron2 = new Patron("Bob", "P002");
        library.registerPatron(patron1);
        library.registerPatron(patron2);

        // Simulate borrowing and returning books
        System.out.println("Borrowing 1984 for Alice: " + library.borrowBook("123456789", "Alice"));
        System.out.println("Returning 1984 for Alice: " +
                library.returnBook("123456789", "Alice"));
    }
}