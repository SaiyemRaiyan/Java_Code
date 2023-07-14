
package javacode;

import java.util.Scanner;


public class CelciustoFareheit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double cel,far;
        
        System.out.println("Enter Celcius value: ");
        cel = input.nextDouble();
        
        far = 1.8*cel+32;
        
        System.out.println("Farenheit: "+far);
        
    }
    
}
