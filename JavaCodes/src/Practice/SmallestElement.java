
package javacode;

import java.util.Scanner;

public class SmallestElement 
{
     public static void main(String[] args) 
     {
        Scanner  num = new Scanner(System.in);

        double[] array = new double[10];
        System.out.println("Please Enter the elements: ");
        for(int i=0; i<10; i++) 
        {
            array[i] = num.nextDouble();
        }

        System.out.println("minimum value is: "+min(array));
  }

          public static double min(double[] array) 
    {

        double m = array[0];
        for(int j=1; j<10; j++) 
        {

            if(array[j]<m)
            {
                m = array[j];
            }
        }
         return m;
    }
    
}
