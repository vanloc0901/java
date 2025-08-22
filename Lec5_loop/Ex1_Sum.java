/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_loop;
import java.util.Scanner; 


public class Ex1_Sum {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer N: ");
        int N = scanner.nextInt();
    
        int sum = 0;
     
        for (int i = 1; i <= N; i++) {
            
            sum += i; 
        }
        System.out.println("The sum of numbers from 1 to " + N + " is: " + sum);
    }
}