
package homework;

public class PrimeNumberCheak 
{
   
	
	public PrimeNumberCheak() 
                   {
		
	}
	
	public boolean primeNum(int n) 
                    {
		boolean x = true;
		int i;
		for(i=2; i<=n/2;i++)
                                       {
			if(n % i == 0) 
                                                           {
				x = false;
				break;
			}
		}
		return x;
	}
}
    

