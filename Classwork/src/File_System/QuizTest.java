
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizTest 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        
        Quiz [] q = new Quiz[5];
        int i;
        double max,marks;
        try (Scanner readFile = new Scanner(new File("quiz.txt"))) 
        {
            i = 0;
            max = 0;
            String id;
            double m;
            while(readFile.hasNext())
            {
                id = readFile.next();
                m = readFile.nextDouble();
                q[i] = new Quiz(id,m);
                i++;
                
            }   
        }
            for(Quiz q1 : q) 
        {
            System.out.println(q[i].toString());
            marks = q[i].getMarks();
            if(max<marks)
                max = marks;
        }
        System.out.println("Highest Marks: "+max);
  
    }
}
