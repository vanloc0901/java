import java.util.Arrays;

public class Exercise09_SwapElements {
    public static void swap(int[] arr, int i, int j){
        int tmp=arr[i]; arr[i]=arr[j]; arr[j]=tmp;
    }
    public static void main(String[] args){
        int[] arr={10,20,30};
        System.out.println("Before: "+Arrays.toString(arr));
        swap(arr,0,2);
        System.out.println("After: "+Arrays.toString(arr));
    }
}
