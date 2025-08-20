/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

/**
 *
 * @author lan98
 */
public class Logic { 
    public static void main(String[] args) {
        int x = 42;
        int y = 17;
        int z = 25;

        boolean expr1 = (y < x && y <= z);
        System.out.println("y < x && y <= z: " + expr1);
        boolean expr2 = (x % 2 == y % 2 || x % 2 == z % 2);
        System.out.println("x % 2 == y % 2 || x % 2 == z % 2: " + expr2);
        boolean expr3 = (x <= y + z && x >= y + z);
        System.out.println("x <= y + z && x >= y + z: " + expr3);
        boolean expr4 = !(x < y && x < z);
        System.out.println("!(x < y && x < z): " + expr4);
        boolean expr5 = ((x + y) % 2 == 0 || !((z - y) % 2 == 0));
        System.out.println("(x + y) % 2 == 0 || !((z - y) % 2 == 0): " + expr5);
    }
}