
package javacode;
import java.util.Scanner;

public class AnimalsNumber 
{
    public static void main(String[] args) 
    {
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		int animal, totalAnimal=0, cat=0, rat=0, snake=0;
		char animalType;
		
		while(testCase > 0) 
                {
			animal = input.nextInt();
			animalType = input.next().charAt(0);
			
			if(animalType == 'C') 
				cat += animal;
			else if(animalType == 'R')
				rat += animal;
			else
				snake += animal;
			
			totalAnimal += animal;
			testCase--;
		}
		
		System.out.println("Total: " + totalAnimal + "\nCat: " + cat + "\nRat: " + rat+ "\nSnake: " + snake 
				+ "\nCat%: " + String.format("%.2f%%", (cat*100.0/totalAnimal))
				+ "\nRat%: " + String.format("%.2f%%", (rat*100.0/totalAnimal))
				+ "\nSnake%: " + String.format("%.2f%%", (snake*100.0/totalAnimal)));
		input.close();
    }
}