
package javacode;
import java.util.Scanner;

public class Amount 
{
     
	static int b=0;
	
	public static int deposit(int amount)
        {
	        b=b+amount;
		return b;
	}
	
	public static int withdraw(int amount) 
        {
		b= b-amount;
		return b;
	}
	
	public static void main(String[] args)
        {
		
		Scanner input = new Scanner(System.in);
		int n,a=1;
		int m,nb;
		
		while(a < 10) 
                {
			System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
			System.out.print("Your choice (1/2): ");
			n = input.nextInt();
		
			if(n == 1) 
                        {
				System.out.print("Enter amount to deposit: ");
				m = input.nextInt();
				nb = deposit(m);
				System.out.println("New balance: " + nb);
			}
		
			else if(n==2) 
                        {
				System.out.print("Enter amount to withdraw: ");
				    m = input.nextInt();
				    nb = withdraw(m);
				System.out.println("New balance: " + nb);
			}
			
			System.out.print("\n");
		}
		
		input.close();
	}
}

    

