
package javacode;

import java.util.Scanner;

public class AppleKhaba
{
    public static void main(String[] args) {
        
 
	Scanner input = new Scanner(System.in);
        
         int n = input.nextInt();
	for(int i=1; i<=n; i++)
        {
		int gcd,lcm;			
		gcd = input.nextInt();
                lcm = input.nextInt();
                
                
		if(lcm % gcd == 0) 
                {
			   System.out.println(gcd+lcm);
                }
		else
                {
			  System.out.println(-1);
                }
		
	}		
	
}
}

    

