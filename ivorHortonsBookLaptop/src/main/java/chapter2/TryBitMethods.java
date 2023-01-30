/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2;

/**
 *
 * @author 38597
 */
import static java.lang.Long.*;

public class TryBitMethods {

    public static void main(String[] args) {
        long number = 0xF000_0000_0000_000FL;
        System.out.println("number:\n" + toBinaryString(number));
        long result = rotateLeft(number, 2);
        System.out.println("number rotated left 2 bits:\n" + toBinaryString(result));
        result = rotateRight(number, 3);
        System.out.println("number rotated right 3 bits:\n" + toBinaryString(result));
        result = reverse(result);
        System.out.println("Previous result reversed:\n" + toBinaryString(result));
        System.out.println("Bit count in number:" + bitCount(number));
    }
}
