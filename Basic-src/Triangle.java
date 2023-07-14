
package homework;

  public class Triangle extends Shape 
  {
	private int side1,side2,side3;
	
	Triangle() 
        {
		
	}
	
	Triangle(int side1,int side2,int side3) 
        {
		if (side1+side2 <= side3 || side2+side3 <= side1 || side3+side1 <= side2)
			throw new IllegalArgumentException();
		else
			System.out.println(getPerimeter(side1,side2,side3));
			
	}
  }
	
    

