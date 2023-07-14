
package homework;
 import java.util.Scanner;
public class PrimeNumberCheakMain {
   

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PrimeNumberCheak obj = new PrimeNumberCheak();
                
		
		System.out.print("Enter the number: ");
		int n = input.nextInt();
		boolean b = obj.primeNum(n);
		if(b == true)
			System.out.println(n+ " is a prime number");
		else
			System.out.println(n+ " is not a prime number");
		input.close();
	}

}
    
