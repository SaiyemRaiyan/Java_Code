
package javacode;
import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       int n1,n2,n3;
        
        System.out.print("Enter the first number:");
              n1 = input.nextInt();
        System.out.print("Enter the second number:");
              n2 = input.nextInt();
        System.out.print("Enter the third number:");
              n3 = input.nextInt();
              
              
        if(n1 > n2 && n1 > n3)
        {
            System.out.println(n1 + " eh o maior");
        }
        
        else if(n2 > n3)
        {
            System.out.println(n2 + " eh o maior");
        }
        
        else
        {
            System.out.println(n3 + " eh o maior");
                    
        }
    }
}
