import java.util.ArrayList;

public class Exercise05_FilterEvenNumbers {
    public static ArrayList<Integer> filterEven(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int num: arr) if(num%2==0) res.add(num);
        return res;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println("Even numbers: " + filterEven(arr));
    }
}
