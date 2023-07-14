
package javacode;

public class PrimeNumberCode {
    public static void main(String[] args) 
    {
        int n, sum =0;
        System.out.println("Prime number upto 100: ");
        for(n=2; sum<=1000; n++)
        {
            boolean status = isPrime(n);
            if(status)
            {
                System.out.println(sum+ ". " +n);
                sum++;
            }
            
             
        }
    }
    public static boolean isPrime(int n)
    {
        boolean status = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0)
            {
                status = false;
                break;
            }
        }
        return status;
        
    }
    
    
}
