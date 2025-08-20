/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh 1: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap canh 2: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap canh 3: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Tam giac đeu");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tam giac can");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("Khong phai tam giac hop le");
        }
        scanner.close();
    }
}