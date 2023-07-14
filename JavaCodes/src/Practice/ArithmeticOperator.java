
package javacode;

import java.util.Scanner;

public class ArithmeticOperator {
    
    public static void main(String[] args) {
        
  
  Scanner input  = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = input.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = input.nextInt();
   
 
  System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
 
  System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
 }
 
}

