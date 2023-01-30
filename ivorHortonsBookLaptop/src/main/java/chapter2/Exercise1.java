/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2;

/**
 *
 * @author 38597
 */
public class Exercise1 {

    /*Write a console program to define and initialize a variable of type byte to 1, and then successively multiply 
        it by 2 and display its value 8 times. Explain the reason for the last result.*/
    public static void main(String[] args) {

        byte a = 1;
        //byte result = (byte) (a * 2);
        //a = (byte)(a*2);

        for (int i = 0; i < 8; i++) {
            a = (byte)(a*2);
            System.out.println(a);
        }

    }
}
