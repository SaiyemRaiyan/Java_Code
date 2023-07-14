
package javacode;
import java.time.LocalDate;
public class BalanceWithInterest 
{
    private String accountName,accountType;
    private double balance;
    private float interestRate;
    private int yearOfOpening;
    
    
                       public BalanceWithInterest()
            {
                       this.balance = 2020.0;
            }
    
                         public String GetAccountName()
                    {
                         return this.accountName;
                    }
    
                         
                            public String getAccountType(String accountName) 
                    {
                              return this.accountName = accountName;
                    }
                            
                            
                               public double getBalance()
                    {
                                      return this.balance;
                    }
                               
                               

                            public float getInterestRate()
                   {
    	        return this.interestRate;
                    }
                            
                            

                              public int getYearOfOpening() 
                    {
    	         return this.yearOfOpening;
                    }
                              
                              
     
                         public void setAccountName(String accountName)
                   {
                         this.accountName = accountName;
                   }
                         
                         
                         public void setAccountType(String accountType)
                   {
                      this.accountType = accountType;
                   }
                         
    
                           public void setBalance(double balance)
                    {
                           this.balance = balance;
                    }
                           
                           
                           public void setInterestRate(float interestRate)
                   {
                           this.interestRate = interestRate;
                   }
                           
                           
                             public void setYearOfOpening(int year)
                    {
                            this.yearOfOpening = year;
                    }
    
                             
                               public void deposit(double amount)
                    {
                             this.balance += amount;
                                   System.out.printf("After deposite money new balance is: %.3f taka",balance);
                    }
    
                               
                           public void withDraw(double amount)
                    {
                          this.balance -= amount;
                           System.out.printf("After withdraw new balnce is: %.3f taka",balance);
                   } 
    
                           
    
                              public void calculateBalanceWithInterest() 
                   {
                              LocalDate time = LocalDate.now(); 
                             int duration = time.getYear() - this.yearOfOpening;

                               double interest = this.balance * (this.interestRate/100) * duration;

                                        this.balance += interest;

                                     System.out.println("Name: "+accountName);
                                     System.out.println("Type: "+accountType);
                                     System.out.println("Year: "+yearOfOpening);
                                     System.out.printf("New balance is: %.2f Taka",balance);
                   }
                              

                                    void withdraw(double w) 
                    {
                                              throw new UnsupportedOperationException("Not supported yet."); 
                    }
                                    
}

         
    

