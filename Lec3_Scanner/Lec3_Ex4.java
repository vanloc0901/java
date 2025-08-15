package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first float number (e.g., 2.5): ");
        float firstNumber = scanner.nextFloat();
        System.out.print("Enter the second float number (e.g., 7.5): ");
        float secondNumber = scanner.nextFloat();
        float average = (firstNumber + secondNumber) / 2.0f;
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is: " + average);
    }
}