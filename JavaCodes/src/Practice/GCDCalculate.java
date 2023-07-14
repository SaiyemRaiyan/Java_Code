
package javacode;

import java.util.Scanner;
public class GCDCalculate 
{
    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        
        int m,n;
        
         m = input.nextInt();
         n = input.nextInt();
        
        int tem;
        
        do
        {
            if(n<m)
            {
                tem = m;
                n = m;
                m = tem;
                
            }
            n -=m;
        }
        
        while(n>0);
          System.out.println("GCD: "+ m);
    }
    
}
