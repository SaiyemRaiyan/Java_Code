
package javacode;

import java.util.Scanner;

public class FibonacciMethod 
{
       static int a=0,b=1,c=0;  
      static void Fibonacci(int count)
     {  
        if(count>0)
        {  
         c = a + b;  
         a = b;  
         b = c;  
         System.out.print(" "+c); 
         Fibonacci(count-1);  
        }  
     }  
         public static void main(String args[])
         {  
           Scanner input = new Scanner(System.in);
           int count;  
           System.out.print("Enter any number: ");
           count = input.nextInt();
              Fibonacci(count);
         }
    
}
