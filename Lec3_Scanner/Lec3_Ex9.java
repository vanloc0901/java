package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.nextLine();        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();        
        System.out.println("Number: " + number);
        System.out.println("Sentence: " + sentence);
    }
}