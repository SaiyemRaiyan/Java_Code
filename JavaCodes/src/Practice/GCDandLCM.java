
package javacode;

import java.util.Scanner;
public class GCDandLCM {
    public static void main(String[] args) {
        
   int n,n1,n2,tem,t1,t2,gcd,lcm;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter 1st Number: ");
		 n1= input.nextInt();
		
	       System.out.println("Enter 2nd Number: ");
		n2 = input.nextInt();
		
		t1=n1;
		t2=n2;
		
		while(t2!= 0) 
                {
			tem = t2;
		        t2 = t1%t2;
		        t1 = tem;
	        }
		
		gcd= t1;
		lcm = (n1*n2)/gcd;
		
		 System.out.println("GCD : "+gcd);
		 System.out.println("LCM : "+lcm);
    
      }
}