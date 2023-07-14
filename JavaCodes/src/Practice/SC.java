
package javacode;
import java.util.Scanner;

public class SC 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int w;
        w =input.nextInt();
        switch(w)
        {
            case 0:
                System.out.println("This is very chilled weather");
                break;
            case 1 :
                System.out.println("Rainy Weather");
                break;
            case 2: 
                System.out.println("Winter is here");
                break;
            default:
                System.out.println("The Program will not exist");
                break;
        }
    }
    
}
