/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10.OOP_Book;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookManager = new BookList();
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add new textbook");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count TextBooks and ReferenceBooks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String tbId = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String tbTitle = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    double tbPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Subject: ");
                    String subject = scanner.nextLine();
                    bookManager.addBook(new TextBook(tbId, tbTitle, tbPrice, subject));
                    System.out.println("TextBook added successfully.");
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    String rbId = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String rbTitle = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    double rbPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Publisher: ");
                    String publisher = scanner.nextLine();
                    bookManager.addBook(new ReferenceBook(rbId, rbTitle, rbPrice, publisher));
                    System.out.println("ReferenceBook added successfully.");
                    break;
                case 3:
                    System.out.print("Enter ID of book to update: ");
                    String updateId = scanner.nextLine();
                    Book bookToUpdate = bookManager.findBookById(updateId);
                    if (bookToUpdate != null) {
                        System.out.print("Enter new Title: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Enter new Base Price: ");
                        double newPrice = scanner.nextDouble();
                        scanner.nextLine();
                        String newAttribute;
                        if (bookToUpdate instanceof TextBook) {
                            System.out.print("Enter new Subject: ");
                            newAttribute = scanner.nextLine();
                        } else {
                            System.out.print("Enter new Publisher: ");
                            newAttribute = scanner.nextLine();
                        }
                        bookManager.updateBookById(updateId, newTitle, newPrice, newAttribute);
                        System.out.println("Book updated successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter ID of book to delete: ");
                    String deleteId = scanner.nextLine();
                    if (bookManager.deleteBookById(deleteId)) {
                        System.out.println("Book deleted successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID of book to find: ");
                    String findId = scanner.nextLine();
                    Book foundBook = bookManager.findBookById(findId);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        foundBook.displayDetails();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6:
                    bookManager.displayAllBooks();
                    break;
                case 7:
                    Book expensiveBook = bookManager.findMostExpensiveBook();
                    if (expensiveBook != null) {
                        System.out.println("Most expensive book:");
                        expensiveBook.displayDetails();
                    } else {
                        System.out.println("No books in the list.");
                    }
                    break;
                case 8:
                    bookManager.countBooks();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}