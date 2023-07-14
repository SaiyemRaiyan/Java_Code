
package javacode;

import java.util.Scanner;

public class LabQuiz 
{
  
        public static int total(int n)
        {
		int sum,a;
		a = n/4;
		sum = n+a;
		return sum;
	}

	     public static void main(String[] args)
        {
		Scanner input = new Scanner(System.in);
		int box,all;
		
		System.out.print("Boxes bought: ");
		box = input.nextInt();
		
		all = total(box);
		System.out.println("Total: "+all);
		
	}
}
    

