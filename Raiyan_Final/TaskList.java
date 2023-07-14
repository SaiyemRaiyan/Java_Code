package labfinal;
public class TaskList
  {
	protected String month;
	protected String taskname;
	
	public TaskList()
	{
		
	}
	
	public TaskList(String month,String taskname)
	{
		this.month=month;
		this.taskname=taskname;
		
	}
	
	public void setMonth(String month)
	{
		this.month=month;
	}
	
	public void setTaskName(String taskname)
	{
		this.taskname=taskname;
	}
	
	public String getMonth()
	{
		return month;
	}
	
	public String getTaskName()
	{
		return taskname;
		
	}
	
        @Override
	public String toString()
                   {
		return " [Month=" + month + ", Task=" + taskname + "]";
	}

}