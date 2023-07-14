
package javacode;

import java.util.Scanner;

     public class StringInput 
{
         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             
             String s1,s2;
             System.out.println("Enter first string: ");
             s1 = input.nextLine();
             
             System.out.println("Enter second String:");
             s2 = input.nextLine();
             
             System.out.println("The String what you input is: " +s1+ " " +s2);
             
             
         }
}

