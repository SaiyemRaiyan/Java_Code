
package homework;

public class SumandMultiple 
{
   
	public SumandMultiple() 
        {
		
	}
	
	public int getMultiples(int n) 
        {
		int total = 0;
		System.out.println("3 and 5's Multiples are : ");
                
		for(int i=0;i<=n;i++) 
                {
			if((i%3==0)&&(i%5==0)) 
                        {
				System.out.println(i);
				total +=i; 
			}
			
		}
		   return total;
	}

}  
    

