/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

/**
 *
 * @author lan98
 */
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap mot so nguyen: ");
            int number = scanner.nextInt();
            
            if (number % 2 == 0) {
                System.out.println(number + " la so chan.");
            } else {
                System.out.println(number + " la so le.");
            }
        }
    }
}