
package classwork;

public class Exceptions
{
    public static void main(String[] args)
    {
        System.out.println("Before \n");
        
        try
        {
            int x =30/0;
            System.out.println("No exception");
            
        }
           catch(ArithmeticException e)
        {
            System.out.println("Exception handled");
        }
           finally
        {
            System.out.println("\nFinally Block");
        }
            System.out.println("\n After");
    }
    
}
