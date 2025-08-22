package Lec5_Excercise;
import java.util.Scanner;

public class Ex9_AverageUntilZero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double sum = 0;
            int count = 0;
            
            System.out.println("Enter numbers to calculate the average (enter 0 to stop).");
            while (true) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                if (number == 0) break;
                sum += number;
                count++;
            }
            
            if (count > 0) {
                double average = sum / count;
                System.out.println("Number of inputs: " + count);
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
            } else {
                System.out.println("No numbers were entered to calculate the average.");
            }
        }
    }
}