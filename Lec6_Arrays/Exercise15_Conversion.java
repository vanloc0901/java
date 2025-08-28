import java.util.ArrayList;
import java.util.Arrays;

public class Exercise15_Conversion {
    public static ArrayList<String> arrayToArrayList(String[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
    public static String[] arrayListToArray(ArrayList<String> list){
        return list.toArray(new String[0]);
    }
    public static void main(String[] args){
        String[] arr={"Ann","Bob"};
        System.out.println(arrayToArrayList(arr));
        ArrayList<String> l=new ArrayList<>(Arrays.asList("Charles","David"));
        System.out.println(Arrays.toString(arrayListToArray(l)));
    }
}
