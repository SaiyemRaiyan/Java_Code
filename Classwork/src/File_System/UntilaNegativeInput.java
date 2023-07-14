
package File;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class UntilaNegativeInput 
{
      public static void main(String[] args)throws IOException 
    {

        Scanner input = new Scanner(System.in);
        String FileName;

        double avg = 0.0,c = 0.0,sum = 0.0;


        File myfile= new File("input.txt");
        File myfile2= new File("avg and sum.txt");
       
        Formatter formatter1;
          try (Formatter formatter = new Formatter(myfile)) {
              formatter1 = new Formatter(myfile2);
              while(input.hasNextDouble())
              {
                  double n = input.nextDouble();
                  
                  if(n>=0)
                  {
                      
                      
                      sum+=n;
                      c++;
                      avg = sum/c;
                      formatter.format("%s\r\n",n);
                      
                  }
                  else
                  {
                      
                      System.out.println("You entered " + c+ " numbers");
                      
                      formatter1.format("%s %s\n",sum,avg);
                      
                      break;
                  }
                  
                  
              } }
        formatter1.close();


          try (Scanner read = new Scanner(myfile2)) 
          {
              String fsum= read.next();
              String favg= read.next();
              System.out.println(" Sum= "+fsum+ " Avg= "+favg);
          }


    }
}
      
    

