
package javacode;

import java.util.Scanner;
     public class AreaofaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r ,area, PI = 3.1416;
        System.out.println("Enter Radius: ");
        r = input.nextDouble();
        
        area = PI * r * r ;
        
        System.out.println("Area: "+area);
        
    }
    
}
