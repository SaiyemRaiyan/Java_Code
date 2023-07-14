
package javacode;

import java.util.Scanner;

public class IDnumuber 
{
         public static void main(String[] args) 
       {
             try (Scanner input = new Scanner(System.in))
             {
                 int n;
                 int temp,sum = 0;
                 System.out.print("Please Enter your NSU ID: ");
                 n = input.nextInt();
                 
                 while(n>0)
                 {
                     temp = n % 10;
                     sum += temp;
                     n /= 10;
                 }
                   System.out.print("Summation:  "+sum);
                   System.out.println("\n\n");
             }
            
       }

}

    

