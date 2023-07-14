
public class Student {
   
	private String name;
	private int deposit;
	private int mealAmount;
	private int totalSpent;
	private final int rate = 5;
	
	public String getName() 
        {
		return name;
	}
	public void setName(String name)
        {
		this.name = name;
	}
	public int getDeposit() 
        {
		return deposit;
	}
	public void setDeposit(int deposit)
        {
		this.deposit = deposit;
	}
	public int getMealAmount() 
        {
		return mealAmount;
	}
	public void setMealAmount(int mealAmount)
        {
		this.mealAmount = mealAmount;
	}
	

	public int getTotalSpent() 
        {
		 return this.mealAmount * this.rate;
	}
	
	
	public void displayInformation()
        {
		System.out.println("Name: " + this.name);
		System.out.println("Deposited money : " + this.deposit);
		System.out.println("Meal count: " + this.mealAmount);
		System.out.println("Total spent: " + this.totalSpent);
	}
	
}

