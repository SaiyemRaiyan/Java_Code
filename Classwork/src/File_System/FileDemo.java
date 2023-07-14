
package File;

import java.io.File;
import java.io.IOException;

public class FileDemo 
{
    
    public static void main(String[] args) 
    {
        File myFile = new File("file1.txt");
        
        try
        {
        if(myFile.createNewFile())
            System.out.println("Successfully Created");
        else
            System.out.println("File already exist");
        
            System.out.println(myFile.isHidden());
   
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
    
    }
}

    
