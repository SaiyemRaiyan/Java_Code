
package javacode;
import java.util.Scanner;

public class PalindromeMethod 
{
    
    public static boolean isPalidrome(String s) 
    {
		boolean status = true;
		int i=0;
                int j = s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!= s.charAt(j)) 
                        {
				status = false;
				break;
				
			}
			   i++;
			   j--;
		}
	   return status;
		
		
    }
  
    
             public static void main(String[] args) 
       {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String n = input.nextLine();
		
		boolean status = isPalidrome(n);
		
		if(status) 
                        {
			  System.out.println(n+" is palidrome");
			}
		
		else  
                    
                {
	          System.out.println(n+" is not palidrome");
		}
       }
}
