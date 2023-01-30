/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2;

/**
 *
 * @author 38597
 */
import java.io.IOException; // For code that delays ending the program
public class FruitWait {
    public static void main(String[] args) {
    // Declare and initialize three variables
        short numOranges = 5; // Count of oranges
        short numApples = 10; // Count of apples
        short numFruit = 0; // Count of fruit
        
        // Increment oranges and calculate the total fruit
        numFruit = (short)
                (++numOranges + numApples); 

        // Display the result
        System.out.println("A totally fruity program");
        System.out.println("Total fruit is " + numFruit);
        // Code to delay ending the program
        System.out.println("(press Enter to exit)");
        try {
            System.in.read(); // Read some input from the keyboard
        } catch (IOException e) { // Catch the input exception
            return; // and just return
        }
    }
}
