
package homework;
import java.util.Scanner;

public class LoopException 
{
  public static void main (String [] args)
  {
     try
    {
        {
          Scanner input = new Scanner(System.in);
          int i,c=0;
          do
          {
              
              i = input.nextInt();
              c++;
              
          }
          while(i >= 0);
         
        }
    }
        catch(Exception e)
         {
             System.out.println("Exception Found");
         }

  }
}
    
