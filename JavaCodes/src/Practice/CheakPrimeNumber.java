
package javacode;

import java.util.Scanner;
public class CheakPrimeNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         int n=0,i,c=0;
        
        n = input.nextInt();
        
        
        for (i = 2; i<n ; i++) 
        {
            if(n%i == 0)
            {
                c++;
                break;
            }
        }
        if(c == 0)
        {
            System.out.println("Prime Number");
        }
        
        else
        {
            
            System.out.println("Not a prime number");
        }
        
    }
    
}
