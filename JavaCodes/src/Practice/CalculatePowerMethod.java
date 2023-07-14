
package javacode;

import java.util.Scanner;

public class CalculatePowerMethod 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int b =0, p=0;
        

        System.out.print("Enter base: ");
        b = input.nextInt();

        System.out.print("Enter power: ");
        p = input.nextInt();

        System.out.println(power(b,p));
    }
    

    public static int power(int x, int y)
    {
        int power = 1;

        for(int i=0; i<y; i++)
            power = power*x;

        return power;
    }
}
    

