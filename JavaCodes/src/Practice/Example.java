
package javacode;

import java.util.Scanner;
public class Example {
  public static void main(String args[])  
{  
System.out.print("Enter a character: ");  
Scanner input = new Scanner(System.in);  
char ch = input.next().charAt(0);  
 int asciiValue = ch; 
System.out.println("ASCII value of " +ch+ " is: "+asciiValue);  
}  
}

