/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;
import java.util.Scanner;

public class AgeGroupCategorization {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap tuoi: ");
            int age = scanner.nextInt();
            
            if (age < 0) {
                System.out.println("Tuoi không hop le.");
            } else if (age <= 12) {
                System.out.println("Tre em");
            } else if (age <= 19) {
                System.out.println("Thanh thieu nien");
            } else if (age <= 59) {
                System.out.println("Ngưei truong thanh");
            } else {
                System.out.println("Nguoi cao tuoi");
            }
        }
    }
}