import java.util.Arrays;

public class Exercise02_ReverseArray {
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {11,42,-5,27,0,89};
        System.out.println("Original: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}
