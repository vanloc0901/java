/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap nam: ");
            int year = scanner.nextInt();
            
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeap) {
                System.out.println(year + " la nam nhuan.");
            } else {
                System.out.println(year + " khong phai nam nhuan.");
            }
        }
    }
}
