/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2;

/**
 *
 * @author 38597
 */
public class Exercise4 {
    /*The diameter of the sun is approximately 865,000 miles. The diameter of Earth is approximately 7600 
    miles. Use the methods in the class Math to calculate the following:
    The volume of Earth in cubic miles
    The volume of the sun in cubic miles
    The ratio of the volume of the sun to the volume of Earth*/
    
    
    public static void main(String[] args){
        double diameterSun = 865_000;
        double diameterEarth = 7600;
        double ratio = 0;
        double volumeOfEarth = 4 / 3 * Math.PI * Math.pow(diameterEarth, 3);
        double volumeOfSun = 4 / 3 * Math.PI * Math.pow(diameterSun, 3);
        //System.out.println(volumeOfSun +"+"+ volumeOfEarth);
        ratio = volumeOfSun/volumeOfEarth;
        System.out.println("Ratio of Sun to Earth is: " + ratio);
    }
}
