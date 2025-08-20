/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

import java.util.Scanner;

/**
 *
 * @author lan98
 */
public class Ex2 {
public static void main(String []args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap n");
    int n = scanner.nextInt();
    switch(n){
        case 5 -> System.out.print(" Five \n");
        case 4 -> System.out.print(" Four \n");
        case 3 -> System.out.print(" Three \n");
        case 2 -> System.out.print(" Two \n");
        case 1 -> System.out.print(" One \n");
        default -> System.out.print(" N/A \n");
    }
}}
