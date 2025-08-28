import java.util.Arrays;

public class Exercise10_ConcatenateArrays {
    public static int[] concat(int[] a, int[] b){
        int[] res=new int[a.length+b.length];
        for(int i=0;i<a.length;i++) res[i]=a[i];
        for(int i=0;i<b.length;i++) res[a.length+i]=b[i];
        return res;
    }
    public static void main(String[] args){
        int[] a1={1,2,3}, a2={4,5,6};
        System.out.println(Arrays.toString(concat(a1,a2)));
    }
}
