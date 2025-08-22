/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_loop;

import java.util.Random;
import java.util.Scanner;


public class Ex7_NumberGuessin {

    public static void main(String[] args) {
        
       
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

     
        int secretNumber = random.nextInt(100) + 1;
        
        int userGuess; 
        int numberOfTries = 0; 
       
        System.out.println("Chao mung ban den voi tro choi DOAN So!");
        System.out.println("Toi da nghi ra mot so trong khoang tu 1 den 100.");
        System.out.println("Ban co the doan ra do la so nao khong?");
        
    
        do {
            
            System.out.print("Your guess: ");
            userGuess = scanner.nextInt();
            
            
            numberOfTries++;

            
            if (userGuess > secretNumber) {
                System.out.println("Your number is higher than the secret number.");
            } else if (userGuess < secretNumber) {
                System.out.println("Your number is lower than the secret number.");
            }

        } while (userGuess != secretNumber);

        

        
        System.out.println("Congratulations! You guessed the number correctly!");
        System.out.println("The secret number was: " + secretNumber);
        System.out.println("You found it after " + numberOfTries + " tries!");
        
        
        scanner.close();
    }
}