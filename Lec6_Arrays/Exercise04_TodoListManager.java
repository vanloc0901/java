import java.util.ArrayList;
import java.util.Scanner;

public class Exercise04_TodoListManager {
    public static void main(String[] args) {
        ArrayList<String> todo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add task  2.View tasks  3.Remove task  4.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter task: ");
                    todo.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println(todo);
                    break;
                case 3:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    if(idx>=0 && idx<todo.size()) todo.remove(idx);
                    break;
            }
        } while(choice!=4);
        sc.close();
    }
}
