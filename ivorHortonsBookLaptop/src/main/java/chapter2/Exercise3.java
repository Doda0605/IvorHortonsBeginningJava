/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2;

import java.math.BigDecimal;

/**
 *
 * @author 38597
 */
public class Exercise3 {

    /*Write a program that defines a floating-point variable initialized with a dollar value for your income and a 
    second floating-point variable initialized with a value corresponding to a tax rate of 35 percent. Calculate and output the amount of tax you must pay with the dollars and cents stored as separate integer values 
    (use two variables of type int to hold the tax, perhaps taxDollars and taxCents).*/

    public static void main(String[] args) {
        double $ = 973.4;
        double taxRate = 0.35;
        double tax = $ * taxRate;
        System.out.println(tax);

        BigDecimal bigDecimal = new BigDecimal(String.valueOf(tax));
        int taxDollars = bigDecimal.intValue();
        System.out.println("Double Number: " + bigDecimal.toPlainString());
        System.out.println("Integer Part: " + taxDollars);
        System.out.println("Decimal Part: " + bigDecimal.subtract(new BigDecimal(taxDollars)).toPlainString());
    }
}
