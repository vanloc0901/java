import java.util.ArrayList;
import java.util.Scanner;

public class Exercise06_UnlimitedInput {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true){
            int x = sc.nextInt();
            if(x==-1) break;
            list.add(x); sum+=x;
        }
        System.out.println("Numbers: "+list);
        System.out.println("Sum: "+sum);
        sc.close();
    }
}
