/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

import java.util.Scanner;

public class QuadrantDetermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = scanner.nextDouble();
        System.out.print("Nhap y: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0)
            System.out.println("Goc phan tư thu 1");
        else if (x < 0 && y > 0)
            System.out.println("Goc phan tư thu 2");
        else if (x < 0 && y < 0)
            System.out.println("Goc phan tư thu 3");
        else if (x > 0 && y < 0)
            System.out.println("Goc phan tư thu 4");
        else
            System.out.println("Nam tren truc toa đo");
        scanner.close();
    }
}