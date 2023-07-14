
package javacode;

import java.util.Scanner;

public class FactorialMethod 
{
    public static void main(String[] args) 
    {
        
    
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a number: "); 
         int num = input.nextInt();
         factorial(num);
    }
    
      static void factorial(int n)
    {
       int i,f=1;
       for(i=1; i<=n; i++)
       {
         f=f*i;
       }
         System.out.println("Factorial of " +n + " is "+f); 
    }
    
}
