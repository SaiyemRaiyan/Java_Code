
package javacode;
import java.util.Scanner;

public class Function
{
    public static int max(int WeatherUpdate)
   {
       {
             switch(WeatherUpdate)
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
            case 3:
                break;
            default:
                break;
                
         }
              return(WeatherUpdate);
       }
   }

             public static void main(String[] args)  
       {
             Scanner input = new Scanner(System.in);
                int WeatherUpdate;
            System.out.println("Enter any number: ");
            WeatherUpdate = input.nextInt();

                max(WeatherUpdate);

       }
}