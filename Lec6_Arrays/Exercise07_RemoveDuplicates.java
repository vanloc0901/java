import java.util.ArrayList;
import java.util.Arrays;

public class Exercise07_RemoveDuplicates {
    public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
        ArrayList<Integer> res=new ArrayList<>();
        for(int n:list) if(!res.contains(n)) res.add(n);
        return res;
    }
    public static void main(String[] args){
        ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,3,2,1,4,3,5));
        System.out.println(removeDup(l));
    }
}
