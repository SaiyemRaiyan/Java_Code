public class Octagon extends Shape implements Colorable
{
	
	private double firstSide;
	
	public Octagon() 
        {
		super();
	}
	public Octagon(String color, boolean filled, double m) 
        {
		super(color, filled);
		this.firstSide = m;
	}
	public double getfirstSide()
        {
		return this.firstSide;
	}
	public void setfirstSide(double m)
        {
		this.firstSide = m;
	}
	@Override
	public double getArea() 
        {
		return 2*(1 + Math.sqrt(2) * (firstSide * firstSide));
	}

	@Override
	public double getPerimeter() 
        {
		return 8*firstSide;
	}
	
	@Override
	public String HowtoColor() 
        {
		return "Color each side with Green";
	}


}