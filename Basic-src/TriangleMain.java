
package homework;
import java.util.Scanner;

public class TriangleMain 
{

	public static void main(String arg[]) 
        {
		try 
                {
			Scanner input = new Scanner(System.in);
                        
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			Triangle t = new Triangle(a,b,c);
			input.close();
		}
		    catch(IllegalArgumentException e)
                {
			System.out.println("Exception found");
		}
	}

	
	public double getPerimeter(int side1,int side2,int side3)
        {
		
		return side1+side2+side3;
	}
}



