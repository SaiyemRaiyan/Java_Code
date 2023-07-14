
package File;


import java.util.Formatter;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) {
        try{
            int n;
            Scanner input = new Scanner(System.in);
            Formatter fObject = new Formatter();
         
                
                for (int i = 1; i <= 10;  i++) {
                n= input.nextInt();
                fObject.format("%d \n",n);
            }
                fObject.close();
            }
            
                
            
        catch(FilenotFoundException e){
            System.out.println(e);
        }
        }
}
