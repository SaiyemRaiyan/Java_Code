package labfinal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
                             TaskWindow t = new TaskWindow();

                       System.out.println("**To-Do List**");
                      boolean repeat = true;

do {
	
	try {
		System.out.println("1.Add a task ");
		System.out.println("2.Show Tasks to do");
		System.out.println("3.Exit");
		
		System.out.println("Choose: ");
		
		int option =scan.nextInt();
                                        scan.nextLine();
		
                switch(option)
		{
		
		case 1:
			System.out.println();
			t.addTask();
			System.out.println();
			break;
			
		case 2:
			
			System.out.println("	Enter Month: ");
			String Mname = scan.nextLine();
			System.out.println();
			t.showTask(Mname);
			System.out.println();
			break;
			
		case 3:
			repeat=false;
			System.out.println("See you again!!");
			break;
			
		default :
			System.out.println("Invalid Input");
			break;
			
		}
		
		}
                                           catch(InputMismatchException e)
	{
			System.out.println("Wrong Input!!");
			scan.next();
	}
	
	
	
}

                        while(repeat==true);
                        scan.close();


	}

}