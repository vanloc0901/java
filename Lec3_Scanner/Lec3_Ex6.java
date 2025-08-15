/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter your full name: ");
            String fullName = scanner.nextLine();
            System.out.println("Hello, " + fullName + "!");
        }
    }
}