/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_loop;
import java.util.Scanner;
public class Ex8_InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number from 1 to 10: ");
            number = scanner.nextInt();
            if (number < 1 || number > 10) {
                System.out.println("Invalid number, please try again.");
            }
        } while (number < 1 || number > 10);
        System.out.println("You entered a valid number: " + number);
        scanner.close();
    }
}