
package javacode;

import java.util.Scanner;

public class RelationalOperator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.println("Enter an integer: ");
        num = input.nextInt();
        
        if(num<0)
        {
            System.out.println("Negative");
        }
            else if (num>0)
                    {
                        System.out.println("Positive ");
                    }
            else
                    {
                    System.out.println("Equal to zero ");
                    }
        }
        
    }
    

