
package javacode;

import java.util.Scanner;

public class CylinderMethod {
    public static void main(String[] args) 
       {
        
            Scanner input = new Scanner(System.in);
         	double r,h,x;
		System.out.println("Enter the length of Cubiod:");
         	 r = input.nextDouble();
		
		System.out.println("Enter the breadth of Cubiod:");
         	 h = input.nextDouble();
		 
	           x = area(r,h); 
                   System.out.printf("Perimeter is %f : ");
 
               System.out.println("Total SurfaceArea Of Cylinder is:  " + x);
      }

     public static double area(double r,double h) 
    {   
        double PI = 3.1416;
        double per = 2*PI*r*h;
       double  a= ((2*22*r)/7)*(r+h);
       		return a;
      }
    
}

