package labfinal;
import java.util.Scanner;

public class TaskWindow implements GettingTasks 
{
	
	private static final boolean[] TodoList = null;
	TaskList TaskList[]= new TaskList[100];
	Scanner scan = new Scanner(System.in);

        @Override
	public void addTask() 
         {
		int flag=0; int tmp=0;
		System.out.println("Enter Month:");
		String Mname= scan.nextLine();
		System.out.println("Enter Task Name");
		String Tname= scan.nextLine();
		
		
		for(int i=0;i<TaskList.length;i++)	
		{
			if(TaskList[i]== null)
			{
				TaskList[i]= new TaskList(Mname,Tname);
			tmp=i;
			flag=1;
			break;
			}
			
		}
		       if(flag==1)
		{
			
			
			
			System.out.println("New Task has been saved");
			System.out.println("*********************************************");
			System.out.println(TaskList[tmp].toString());
			System.out.println("*********************************************");
			
	
			
		}
                       
		        else
		{
			System.out.println("Task not saved!");
		}
	}
		
	

	@Override
	public void showTask(String Mname) 
         {
		int count = 0;
                  try
		{
                                            for (labfinal.TaskList TaskList1 : TaskList) 
                             {
                                            if ((TaskList1.month).equals(Mname)) 
                                            {
                                              System.out.println(TaskList1.toString());
                                            }
                             }
			count=1;
		}
		catch(NullPointerException b)
		{
			if(count==0) 
                                                           {
			    System.out.println("");
			}
		}
		
         }
		
	
}