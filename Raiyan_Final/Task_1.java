
package labfinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task_1 
{
	
	public static void main(String[] agrs) throws IOException 
         {
		 
                    int arr[] = new int[100];
     
                    Random rand = new Random();
                       for(int i=0;i<100;i++)
                   {
                        arr[i] = rand.nextInt(2001)-1000;
                   }
        
                         System.out.print("Please enter an index: ");
                           Scanner input = new Scanner(System.in);
                                  int index = input.nextInt();
         
       
                                while(index<0 || index>=100)
                         {
                                         System.out.print("The index given is out of bounds!\nPlease enter an index: ");
                                         index = input.nextInt();
                         }
                                                System.out.println("Element at position "+index+" = "+arr[index]);
        
                                        int previousCount = 0;
                                        File file = new File("Count.txt");
                                        
                                                if(file.exists())
                                           {
                                                input = new Scanner(file);
                                                   if(input.hasNextInt())
                                      {
                                                     previousCount = input.nextInt();
                                      }
                                               input.close();
                     }
                                                
                                     int count = previousCount+1;
                                     
                                 try ( FileWriter f = new FileWriter(new File("Count.txt")))
                              {
                                     f.write(""+count);
                              }
                                 System.out.println("Count: "+count+" updated to the file Count.txt");
	}
        
}