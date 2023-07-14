
import java.util.Scanner;

public class Meal 
{
     public static void main(String[] args) 
   {
		Scanner input = new Scanner(System.in);
		Student[] s = new Student[5];
                
                for (int i=0; i<s.length; i++) 
                {
                    s[i] = new Student();
           
                }
                
		int deposit;
		int i,serial,meal = 0;
		String name;
		
		System.out.println("Set Deposit of each student:\n");
		
            for(Student item : s) 
          {
             System.out.println("Set Name:\n");
             name = input.nextLine();
             item.setName(name);
             
             System.out.println("Set Deposit:\n");
             deposit = input.nextInt();
             item.setDeposit(deposit);
          }
		
		while(true) 
                {
			System.out.println("Serial no of the student: \n");
			serial = input.nextInt();
			
			System.out.println("Choose from these option:\n 1.Show Information\n 2.Spend Money\n 3.Previous menu");
			i = input.nextInt();
			
                    switch(i) 
                    {
                        case 1:
                            meal++;
                            s[serial].setMealAmount(meal);
                            break;
                            
                        case 2:
                            System.out.println("Students name: " + s[serial].getName());
                            System.out.println("Meal Amount of " + s[serial].getName() + " is " + s[serial].getMealAmount() );
                            System.out.println("Total money spent: " + s[serial].getTotalSpent());
                            break;
                            
                        case 3:
                            break;
                            
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
		}
		
	}
}
