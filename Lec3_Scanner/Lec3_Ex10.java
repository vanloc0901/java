
import java.util.Scanner;
import java.util.InputMismatchException;
public class Lec3_EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",\\s*");
        System.out.println("Enter a list of numbers separated by commas (e.g., 10, 25, 7, 32):");
        
        System.out.println("You entered the following numbers:");
        while (scanner.hasNext()) {
            try {
                int number = scanner.nextInt();
                System.out.println(number);
            } catch (InputMismatchException e) {
                System.out.println("'" + scanner.next() + "' is not a valid number and was skipped.");
            }
        }
    }
}