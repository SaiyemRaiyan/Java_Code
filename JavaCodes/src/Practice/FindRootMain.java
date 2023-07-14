
package javacode;

public class FindRootMain 
{
    public static void main(String[] args) 
  {
		FindRoot e1 = new FindRoot(1.00, -4.00, 4.00);
		FindRoot e2 = new FindRoot(5.00, -4.00, 4.00);
                
		boolean b;
		System.out.println("Equation1: x^2-4x+4=0");
		
		b = e1.isRealRoot();
                
		if(b == true) 
                {
			double r1 = e1.getRoot1();
			double r2 = e1.getRoot2();
                        
			System.out.println("Root 1: "+r1+"\nRoot 2: "+r2);
		}
                
		else if(b == false) 
                {
			System.out.println("No real roots.");
		}
                
		System.out.println("Equation2: 5x^2-4x+4=0");
		
		b = e2.isRealRoot();
                
		if(b == true) 
                {
			double r1 = e2.getRoot1();
			double r2 = e2.getRoot2();
                        
			System.out.println("Root 1: " +r1+"\nRoot 2: "+r2);
		}
                
		else if(b == false) 
                {
			System.out.println("No real roots.");
		}
	}
}

