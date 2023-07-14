
package javacode;
public class PrimeNumberMethod 
{
    public static void main(String[] args) 
    {
      int n=2, count=0;
      while (count<=1000)
      {
          boolean status = isPrime(n);
          if(status)
          {
              System.out.println(count+ ". " +n);
              count++;
          }
               n++;
      }
    }
    
    
    public static boolean isPrime(int n)
    {
        boolean status = true;
        int i=2;
       do
        {
            if(n%i == 0)
            {
                status = false;
                break;
            }
           
            i++;
        }
       while(i<= Math.sqrt(n));
       
       //for (i=2;i<= Math.sqrt(n);i++)
                 //if(n%i == 0)
                //{
               //  status = false;
              //  break;
             //  }
           
        // while(i<= Math.sqrt(n))
        //{
        //if(n%i == 0)
                //{
               //  status = false;
              //  break;
             //  }
            //i++;
           // }
       
        return status;
    }
}