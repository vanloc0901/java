/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_loop;
import java.util.Random; 

public class RollDoubles {

    public static void main(String[] args) {
        
       
        Random randomGenerator = new Random(); 
        int die1, die2; 
        int rollCount = 0; 
        
        System.out.println("Bat đau tung xuc xac...");
        
        
        do {
            
            rollCount++;
            
           
            die1 = randomGenerator.nextInt(6) + 1;
            die2 = randomGenerator.nextInt(6) + 1;
            
            
            System.out.println("Roll " + rollCount + ": " + die1 + " and " + die2);
            
        } while (die1 != die2); 
        
      
        System.out.println("You rolled doubles after " + rollCount + " tries!");
        
    }
}