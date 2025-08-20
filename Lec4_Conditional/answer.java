/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_Conditional;

/**
 *
 * @author lan98
 */
public class answer {

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static int main(double x, double y) {
 if (x > 0 && y > 0) {
 return 1;
 } else if (x < 0 && y > 0) {
 return 2;
 } else if (x < 0 && y < 0) {
 return 3;
 } else if (x > 0 && y < 0) {
 return 4;
 } else {
 return 0;
 }
}
}
