
package homework;
import java.util.Scanner;
public class UpperCaseMain {
   

	public static void main(String[] args) {
		UpperCase check = new UpperCase();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String line = input.nextLine();
		
                System.out.println("\nUppercase is:");
		System.out.println(check.UpperCase(line));

	}
}

