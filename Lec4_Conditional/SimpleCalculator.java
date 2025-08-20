/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so thu nhat: ");
            double a = scanner.nextDouble();
            System.out.print("Nhap so thu hai: ");
            double b = scanner.nextDouble();
            System.out.print("Nhap toan tu (+, -, *, /): ");
            char op = scanner.next().charAt(0);
            
            switch (op) {
                case '+' -> System.out.println("Ket qua = " + (a + b));
                case '-' -> System.out.println("Ket qua = " + (a - b));
                case '*' -> System.out.println("Ket qua = " + (a * b));
                case '/' -> {
                    if (b != 0) System.out.println("Ket qua = " + (a / b));
                    else System.out.println("Loi: chia cho 0");
                }
                default -> System.out.println("Toan tu khong hop le");
            }
        }
    }
}