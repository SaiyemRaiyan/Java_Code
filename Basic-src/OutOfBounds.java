
package homework;

import java.util.Scanner;

public class OutOfBounds
{
   public static void main(String[] args)
   {

        int[] arr = new int[100];
        int n = (int)(Math.random()*100);
        
        for(int i=0; i<arr.length; i++) 
        {
            arr[i] = n;
        }
           Scanner input = new Scanner(System.in);
           System.out.print("Enter an index: ");
        
        try 
        {
            int idx = input.nextInt();
            System.out.println(arr[idx]);
        } 
        
        catch(Exception ex) 
        {
            System.out.println("Out Of Bounds");
        } 
        
    }
    
}
