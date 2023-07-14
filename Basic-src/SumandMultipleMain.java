
package homework;
 import java.util.Scanner;
public class SumandMultipleMain 
{
  
	public static void main(String[] args) 
        {
		SumandMultiple checkMultiples = new SumandMultiple();
		Scanner input= new Scanner(System.in);
                
		System.out.println("Enter the limit : ");
		int num = input.nextInt();
                
		System.out.println("Sum of the multiples : " + checkMultiples.getMultiples(num));
	}

}
    

