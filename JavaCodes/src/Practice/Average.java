
package javacode;

import java.util.Scanner;

public class Average 
{
      public static void main(String[] args) 
      {
        Scanner input = new Scanner(System.in);

         int pos = 0,neg = 0,sum = 0,count = 0;

            double avg;

            System.out.println("Please Enter the number: ");
            int n;

            while ((n = input.nextInt()) != 0)
            {
                sum += n;
                count++;
                if (n > 0)
                {
                    pos++;
                } 
                  else if (n < 0) 
                {
                    neg++;
                }
            }
            
            avg = (double)sum/count;
            System.out.println("Number of positives is " + pos);
            System.out.println("Number of negatives is " + neg);
            System.out.println("Total is " + sum);
            System.out.printf("The average is: " + avg);

    }

}
    

