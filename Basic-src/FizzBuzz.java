package homework;

public class FizzBuzz 
{
	
	public FizzBuzz()
        {
		
	}
	
	  public String checkNumber(int n) 
        {
		String s = "";
		if(n%3 == 0 && n%5 != 0)
			s = "Fizz";
		else if(n%5 == 0 && n%3 != 0)
			s = "Buzz";
		else if(n%3 == 0 && n%5 == 0)
			s = "FizzBuzz";
		return s;
	}
}