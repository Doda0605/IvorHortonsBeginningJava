/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2;

/**
 *
 * @author 38597
 */
public class Exercise2 {

    /*Write a console program to declare and initialize a double variable with some value such as 1234.5678. 
    Retrieve the integral part of the value and store it in a variable of type long, and retrieve the fi rst four digits 
    of the fractional part and store them in an integer of type short. Display the value of the double variable 
    by outputting the two values stored as integers.*/

    public static void main(String[] args) {

        double a = 1234.5678;
        long b = (long) a;
        long c = b * 10 * 10 * 10 * 10;
        //System.out.println(c);
        //long doesn't have decimals so first four digits are always 0
        short d = 0;
        System.out.println(b + "." + d);
    }
}
