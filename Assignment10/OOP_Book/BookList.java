/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10.OOP_Book;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;

public class BookList {
    private final ArrayList<Book> bookList;

    public BookList() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equalsIgnoreCase(id)) {
                return book;
            }
        }
        return null;
    }

    public boolean updateBookById(String id, String newTitle, double newBasePrice, String newAttribute) {
        Book book = findBookById(id);
        if (book != null) {
            book.setTitle(newTitle);
            book.setBasePrice(newBasePrice);
            if (book instanceof TextBook) {
                ((TextBook) book).setSubject(newAttribute);
            } else if (book instanceof ReferenceBook) {
                ((ReferenceBook) book).setPublisher(newAttribute);
            }
            return true;
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        Book book = findBookById(id);
        if (book != null) {
            bookList.remove(book);
            return true;
        }
        return false;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books in the list.");
            return;
        }
        System.out.println("--- All Books ---");
        for (Book book : bookList) {
            book.displayDetails();
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            return null;
        }
        Book mostExpensive = bookList.get(0);
        for (Book book : bookList) {
            if (book.calculatePrice() > mostExpensive.calculatePrice()) {
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

    public void countBooks() {
        int textBookCount = 0;
        int refBookCount = 0;
        for (Book book : bookList) {
            if (book instanceof TextBook) {
                textBookCount++;
            } else if (book instanceof ReferenceBook) {
                refBookCount++;
            }
        }
        System.out.println("Total TextBooks: " + textBookCount);
        System.out.println("Total ReferenceBooks: " + refBookCount);
    }
}