/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so thu nhat: ");
            int a = scanner.nextInt();
            System.out.print("Nhap so thu hai: ");
            int b = scanner.nextInt();
            System.out.print("Nhap so thu ba: ");
            int c = scanner.nextInt();
            
            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            
            System.out.println("So lon nhat la: " + max);
        }
    }
}