
package javacode;

import java.util.Scanner;

public class SmallestFactors
{
    public static void main (String[] args)
  {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=2; n>1; i++)

      {

           if(n%i == 0)

      {
              System.out.print(i+ " ");
              n/=i;
              i=1;

       }

    }

  }

}


    

