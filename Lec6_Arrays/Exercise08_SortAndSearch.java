import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_SortAndSearch {
    public static void main(String[] args){
        int[] arr={40,20,50,10,30};
        Arrays.sort(arr);
        System.out.println("Sorted: "+Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int idx=-1;
        for(int i=0;i<arr.length;i++) if(arr[i]==x) idx=i;
        if(idx!=-1) System.out.println(x+" found at index "+idx);
        else System.out.println("Not found");
        sc.close();
    }
}
