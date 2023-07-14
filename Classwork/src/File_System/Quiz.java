
package File;

public class Quiz 
{
    private final String id;
    private final double marks;
    
    public Quiz(String id, double marks)
    {
        this.id = id;
        this.marks = marks;
    }
     public double getmarks()
     {
         return marks;
     }
    @Override
     public String toString()
     {
         return "ID: " + this.id + "Marks: " + this.marks;
         
     }
     
    double getMarks()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
