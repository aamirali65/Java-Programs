package Constructor;

import java.util.ArrayList;

public class Library {
    String name;
    ArrayList<String> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(String book) {
        books.add(book);
    }

    void removeBook(String book) {
        books.remove(book);
    }

    void displayBooks() {
        System.out.println("Books in " + name + ": " + books);
    }
}
