package homework;
import java.util.Scanner;


public class FizzBuzzMain 
{

	     public static void main(String[] args) 
        {
		Scanner input= new Scanner(System.in);
		System.out.print("Input the number: ");
		int n = input.nextInt();
		
		FizzBuzz obj = new FizzBuzz();
		String s = obj.checkNumber(n);
		
		System.out.println(s);
		input.close();
	}

}
