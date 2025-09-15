/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10.OOP_Book;


public class ReferenceBook extends Book {
    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String id, String title, double basePrice, String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public double calculatePrice() {
        // Increase basePrice by 20%
        return getBasePrice() * 1.2;
    }

    @Override
    public void displayDetails() {
        System.out.print("ReferenceBook - ");
        super.displayDetails();
        System.out.println(", Publisher: " + publisher + ", Final Price: " + calculatePrice());
    }
}