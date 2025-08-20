/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

import java.util.Scanner;

public class AcademicGrading {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap diem (0-10): ");
            double score = scanner.nextDouble();
            
            if (score < 0 || score > 10) {
                System.out.println("Diem khong hop le.");
            } else if (score >= 9.0) {
                System.out.println("Xuat sac");
            } else if (score >= 8.0) {
                System.out.println("Gioi");
            } else if (score >= 6.5) {
                System.out.println("Kha");
            } else if (score >= 5.0) {
                System.out.println("Trung binh");
            } else {
                System.out.println("Yeu");
            }
        }
    }
}