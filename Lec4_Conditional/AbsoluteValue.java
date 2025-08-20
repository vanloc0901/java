/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;


import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n");
        double n = scanner.nextDouble();
        double abs = (n >= 0) ? n : -n ;
        System.out.println("Gia tri tuyet doi cua n =" +abs);
    }
       
    
    
}
