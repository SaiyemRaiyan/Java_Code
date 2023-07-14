
package javacode;

import java.util.Scanner;

public class Fibonacci {
     public static void main(String[] args) {
		
  Scanner input=new Scanner(System.in);
 
  System.out.println("User input:");
  int n =input.nextInt();
  
  int n1=0,n2=1,sum;
  
  System.out.print(n1 + " " + n2);
  
  for(int i=3;i<=n;i++)
  {
	  sum=n1+n2;
	  System.out.print( " " + sum);
	 
	  n1=n2;
	  n2=sum;
	  
  }
  

	}

     
}
    

