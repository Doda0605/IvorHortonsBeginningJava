/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2;

/**
 *
 * @author 38597
 */
public class TryEnumeration {
    // Define an enumeration type for days of the week

    enum Day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
        // Define three variables of type Day
        Day yesterday = Day.Thursday;
        Day today = Day.Friday;
        Day tomorrow = Day.Saturday;
        // Output the values of the Day variables
        System.out.println("Today is " + today);
        System.out.println("Tomorrow will be " + tomorrow);
        System.out.println("Yesterday was " + yesterday);
    }
}
