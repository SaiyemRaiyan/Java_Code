
package homework;

public class Shape 
{
        private String color;
	private boolean filled;
	
	Shape() {
		
	}
	Shape(String color, boolean filled) 
        {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor()
        {
		return this.color;
	}
	
	public void setColor(String color)
        {
		this.color = color;
	}
	
	public boolean isFilled () 
        {
		return this.filled;
	}
	
	public void setFilled(boolean filled)
        {
		this.filled = filled;
	}
	
	
	public double getPerimeter(int side1,int side2,int side3)
        {
		return 0;
	}
	
	@Override
	public String toString() 
        {
		return "Shape";
	}
	double areaMeasure() 
        {
		
		return 0;
	}

}

    

