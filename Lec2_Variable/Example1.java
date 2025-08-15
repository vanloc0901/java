package Lec2_Variable;
public class Example1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        
        int x1 = 1;
        int y1 = x1++ + ++x1 + ++x1 + ++x1 + x1-- - --x1 - x1--;
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);
        
        int x2 = 1;
        int y2 = x2 + ++x2 + x2++;
        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);
        
        int x3 = 1;
        int y3 = x3++ + ++x3 + ++x3 + x3++;
        System.out.println("x3 = " + x3);
        System.out.println("y3 = " + y3);
    } 
}
// int y = x++ + ++x + ++x + x + x-- -x - x--;
// int y = x + ++x + x++;
// int y = x++ + ++x + ++x + x++;