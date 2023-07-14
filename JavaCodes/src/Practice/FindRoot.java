
package javacode;

public class FindRoot 
{
        private double a;
	private double b;
	private double c;
	
	public FindRoot() 
        {
		
	}
	public FindRoot(double a, double b, double c) 
        {
		this.a = a;
		this.b = b;
		this.c = c;
	}
        
	public double getDiscriminant() 
        {
		double dis;
		dis = (this.b*this.b) - (4*this.a*this.c);
		return dis;
	}
        
	public boolean isRealRoot()
        {
		boolean real = false;
		if(this.getDiscriminant() >= 0)
                {
			real = true;
		}
		else if(this.getDiscriminant() < 0) 
                {
			real = false;
		}
		return real;
	}
        
	   public double getRoot1()
        {
		double sr1 = ((-this.b)+(Math.sqrt((this.b*this.b) - (4*this.a*this.c)))) / (2*this.a);
		return sr1;
	}
           
	   public double getRoot2() 
        {
		double sr2 = ((-this.b)-(Math.sqrt((this.b*this.b)-(4*this.a*this.c)))) / (2*this.a);
		return sr2;
	}
}