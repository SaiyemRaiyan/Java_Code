
package classwork;

 class Calc
 {
	int number;
	int number2;
	int result;
	
	public Calc() 
        {
		
	}
	public Calc(int number)
        {	//number = 10
		this.number = number;  //number = 10, obj2
	}
	public Calc(int num1, int num2)
        {
		this.number = num1;
		this.number2 = num2;
	}
	
	void perform() 
        {
		this.result = number * number2;
	}

}
public class Constructor 
{
	
	public static void main(String[] args) 
        {
		Calc obj1 = new Calc(); //object created
		Calc obj2 = new Calc(10);
		Calc obj3 = new Calc(70, 8);
		
		obj1.number = 4;
		obj1.number2 = 5;
		obj1.perform();
		System.out.print("object1: " + obj1.number 
				+"\nobject2: " + obj2.number);
		//System.out.print(obj1.result);
	}

}
