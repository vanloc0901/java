/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so (1-7): ");
            int d = scanner.nextInt();
            String day;
            switch (d) {
                case 1 -> day = "Chu Nhat";
                case 2 -> day = "Thu Hai";
                case 3 -> day = "Thu Ba";
                case 4 -> day = "Thu Tu";
                case 5 -> day = "Thu Nam";
                case 6 -> day = "Thu Sau";
                case 7 -> day = "Thu Bay";
                default -> day = "So khong hop le";
            }
            System.out.println(day);
        }
    }
}
