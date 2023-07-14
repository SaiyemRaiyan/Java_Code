public class Square extends Shape implements Colorable
{
	
	private double firstSide;
	
	public Square() 
        {
		super();
	}
	public Square(String color, boolean filled, double a) 
        {
		super(color, filled);
		this.firstSide = a;
	}
	public double getfirstSide() 
        {
		return this.firstSide;
	}
	public void setfirstSide(double a)
        {
		this.firstSide = a;
	}
	@Override
	public double getArea() 
        {
		return firstSide*firstSide;
	}

	@Override
	public double getPerimeter()
        {
		return 4*firstSide;
	}

	@Override
	public String HowtoColor() 
        {
		return "Color each side with Red";
	}

}
