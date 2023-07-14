
package classwork;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int denominator  = input.nextInt();
        
        try{
            cheak(denominator);
        }
        cheak(Exception e){
        denominator +=1;
        int x = 10/denominator;
        System.out.println(e.getMessege());
    }
        finally{
                
             }
        
    }
    public static void cheak() {
        try{
            another();
        }
        catch(Exception ex){
            System.out.println("from cheak method");
        }
        
        public static void another(){
        try{
            throw new IOException("from method");
            
        }
        catch(IOException exc){
            System.out.println("from another() method");
        }
        
    }
    
}
