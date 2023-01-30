/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2;

/**
 *
 * @author 38597
 */
public class CharCodeCalcs {

    public static void main(String[] args) {
        char letter1 = 'A'; // letter1 is ‘A’
 char letter2 = (char) (letter1 + 1); // letter2 is ‘B’
        char letter3 = letter2; // letter3 is also ‘B’
        System.out.println("Here\'s a sequence of letters: "+ letter1 + letter2 + (++letter3));
 // letter3 is now ‘C’
 System.out.println("Here are the decimal codes for the letters : {}\n"+ letter1 + ": " + (int)letter1 + " " + letter2 + ": " + (int)letter2 +" " + letter3 + ": " + (int)letter3); 
 }
}
