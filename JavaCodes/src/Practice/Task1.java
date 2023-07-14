
package javacode;

import java.util.Scanner;

public class Task1 
{
   
      public static boolean matchZebra(String s) 
      {
	        String str = s.toLowerCase();
                boolean b;
 	        int i;
	        int[] a = new int[5];
	        int m = 0;
	        

	        for(i = 0; i < str.length(); i++) 
                {
	            if(str.charAt(i) == 'z' ) 
                    {
	                a[0] = 1;
	                m = i;
	            } 
	        }

	        for(i = m + 1; i < str.length(); i++) 
                {
	            if(str.charAt(i) == 'e')
                    {
	                a[1] = 1;
	                m = i;
	            } 
	        }

	        for(i = m + 1; i < str.length(); i++)
                {
	            if(str.charAt(i) == 'b') 
                    {
	                a[2] = 1;
	                m = i;
	            } 
	        }

	        for(i = m + 1; i < str.length(); i++) 
                {
	            if(str.charAt(i) == 'r')
                    {
	                a[3] = 1;
	                m = i;
	            } 
	        }

	        for(i = m + 1; i < str.length(); i++) 
                {
	            if(str.charAt(i) == 'a') 
                    {
	                a[4] = 1;
	                m = i;
	            } 
	        }


                b = a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1;
	        return b;
	    }

      
	    public static void main(String[] args) 
            {
          Scanner input = new Scanner(System.in);
                  
              System.out.print("Enter String: ");
              String str = input.nextLine();
              
              boolean result = matchZebra(str);
              
              System.out.println(result);
          }
	        
	    }
	