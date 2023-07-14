
package javacode;

import java.util.Scanner;

public class SummationofMatrix 
{
    public static void main(String[] args) 
    {
        
                     
        Scanner input = new Scanner(System.in);
        int [][] A = new int [2][3];
        int [][] B = new int [2][3];
        int [][] C = new int [2][3];
        
        
                           //A input
        System.out.println("Enter the elements for A Matrix: ");
        for (int row = 0; row <2; row++) 
        {
            for (int col = 0;  col< 3; col++)
            {
                System.out.printf("A[%d][%d}= ",row,col);
                 A[row][col] = input.nextInt();
                
            }
            
        }
                
                            //B input
            System.out.println("Enter the elements of B Matrix: ");
                for (int row = 0; row <2; row++) 
            {
                       for (int col = 0;  col< 3; col++) 
              {
                System.out.printf("B[%d][%d}= ",row,col);
                 B[row][col] = input.nextInt(); 
              }
            }
           
                 
                     // Printing A Matrix
                 System.out.println("A = ");
              for (int row = 0; row <2; row++) 
           {
                 for (int col = 0;  col< 3; col++) 
             {
                System.out.print("\t" + A[row][col]);
             }
                System.out.println();
           }
                System.out.println("\n\n");
              
              //Printing B Matrix
                 System.out.println("B = ");
              for (int row = 0; row <2; row++) 
           {
                  for (int col = 0;  col< 3; col++) 
              {
                   System.out.print("\t" + B[row][col]);
              }
              System.out.println();
           }
              System.out.println("\n\n");
              
                     //Adding A and B Matrix
               System.out.println("A+B = ");
                 for (int row = 0; row <2; row++)
           {
               for (int col = 0;  col< 3; col++) 
               {
                   C[row][col] = A[row][col] + B[row][col];
                   System.out.print("\t"+(C[row][col]));
               }
                     System.out.println();
           }
    }
}
                