
package javacode;

import java.util.Scanner;


public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n,i,sum=1;
        
        n = input.nextInt();
        for ( i=1; i<=n; i++) 
        {
           
            sum = sum*i;
            
        }
        
        System.out.println("Factorial is: "+sum);
        
    }
    
}
