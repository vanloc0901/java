public class Exercise11_SecondLargest {
    public static void main(String[] args){
        int[] arr={10,5,8,20,15,20};
        int max=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>max){ second=max; max=n; }
            else if(n>second && n<max) second=n;
        }
        System.out.println("Second largest: "+second);
    }
}
