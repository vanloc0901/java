/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_loop;
import java.util.Scanner;

public class SolidIsoscelesTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the height h of an isosceles triangle: ");
        int h = scanner.nextInt();
        
        System.out.println("Solid Isosceles Triangle (1, 3, 5,...):");

       

       
        for (int i = 1; i <= h; i++) {
            
          
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
          
            System.out.println();
        }

        scanner.close();
    }
}