
package javacode;

import java.util.Scanner;

public class BalanceWithInterestMain 
{
    public static void main(String[] args) 
    {
		BalanceWithInterest account1 = new BalanceWithInterest();
		BalanceWithInterest account2 = new BalanceWithInterest();
		Scanner input= new Scanner(System.in);
		char con;
		
		do {
			System.out.println("Which Account you wanna check? ");
			
			System.out.println("Options (Account1/Account2):");
			System.out.println("Please Enter you choice: ");
			int choice =input.nextInt();
			
			if(choice==1) 
                        {
				System.out.println("\n\n Account Number1 \n\n");
				
				account1.setInterestRate((float)2.5);
				account1.calculateBalanceWithInterest();
                                
				System.out.println("\nDo you want to deposite/withdraw to Account Number1? ");
				System.out.println("1.YES/2.NO");

				int m = input.nextInt();
				
				if(m==1) 
                                {
					
					System.out.println("\nOptions (1.Deposite/2.Withdraw):");
					int c2 =input.nextInt();
                                        
                                    switch (c2) {
                                        case 1:
                                            System.out.println("Amount of deposit: ");
                                            double d  = input.nextDouble();
                                            account1.deposit(d);
                                            break;
                                        case 2:
                                            System.out.println("Amount of withdraw: ");
                                            double w  = input.nextDouble();
                                            account1.withdraw(w);
                                            break;
                                        default:
                                            System.out.println("\nWrong. Please Try again....\n");
                                            break;
                                    }
					
				}
				else if(m==2) {
					System.out.println("\n\nAssalamu Allaikum");
					break;
				}	
			}
			
			else if(choice==2) {
				System.out.println("\n\n Account Number2 \n\n");
				
				account2.setInterestRate((float)3.0);
				account2.calculateBalanceWithInterest();
				System.out.println("Do you wanna Deposite/Withdraw to Account Number2? ");
				System.out.println("1.YES/2.NO");
				
				System.out.println("Enter you choice: ");
				int s =input.nextInt();
                            
                               int s1 = 0;
                            int sl;
                            
				
				if(s1 == 1) 
                                {
					
					System.out.println("\n (1.Deposite/2.Withdeaw):");
					
					int c2 =input.nextInt();
					if(c2==1) 
                                        {
						System.out.println("Enter the amount of deposit: ");
						double a  = input.nextDouble();
						account2.deposit(a);
					}
                                                    else if(c2==2)
                                        {
						System.out.println("Enter the amount of withdraw: ");
						double w  = input.nextDouble();
						account2.withdraw(w);
					}
					
					
				}
				   else(s1 == 1) 
                                                                                          {
					   System.out.println("\n\n Assalamu Allaikum \n");
					   break;
				        }
			}
			System.out.println("\n continue banking? \n press : 'c': ");
			con =input.next().charAt(0);
		}
                                               while(con =='c');		

	}
}


   

    
