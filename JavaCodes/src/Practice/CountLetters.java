
package javacode;

import java.util.Scanner;

public class CountLetters 
{
    public static int countLetters(String s) 
    {
		int c = 0, i;
		
		for(i=0; i<s.length(); i++) 
                {
			if((s.charAt(i) >= 65 && s.charAt(i)<=90) || (s.charAt(i) >= 97 && s.charAt(i)<=122)) 
                        {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) 
        {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Input the String: ");
		String str = input.nextLine();
		
		int count = countLetters(str);
		
		System.out.println("Total letters: " + count);
		
		input.close();
	}

}
    

