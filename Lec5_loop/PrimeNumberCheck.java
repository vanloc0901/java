/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_loop;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer N greater than 1: ");
        int N = scanner.nextInt();

        
        boolean isPrime = true;

       
        if (N <= 1) {
            isPrime = false;
        } else {
            
            for (int i = 2; i <= Math.sqrt(N); i++) {
                
                
                if (N % i == 0) {
                    
                    isPrime = false; 
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println(N + " is a prime number.");
        } else {
            System.out.println(N + " is not a prime number.");
        }
        
        scanner.close();
    }
}