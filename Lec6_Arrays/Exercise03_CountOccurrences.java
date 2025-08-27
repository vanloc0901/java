import java.util.Scanner;

public class Exercise03_CountOccurrences {
    public static void main(String[] args) {
        int[] numbers = {2,5,6,5,2,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find: ");
        int x = sc.nextInt();
        int count = 0;
        for (int num : numbers) if (num == x) count++;
        System.out.println("Number " + x + " appears " + count + " times.");
        sc.close();
    }
}
