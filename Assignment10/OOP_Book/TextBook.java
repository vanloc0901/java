/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10.OOP_Book;

/**
 *
 * @author Administrator
 */
public class TextBook extends Book {
    private String subject;

    public TextBook() {
    }

    public TextBook(String id, String title, double basePrice, String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public double calculatePrice() {
        // Increase basePrice by 10%
        return getBasePrice() * 1.1;
    }

    @Override
    public void displayDetails() {
        System.out.print("TextBook - ");
        super.displayDetails();
        System.out.println(", Subject: " + subject + ", Final Price: " + calculatePrice());
    }
}

