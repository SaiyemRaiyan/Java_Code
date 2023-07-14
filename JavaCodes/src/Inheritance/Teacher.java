
package Inheritance;

public class Teacher extends Person{
    
    String qualifications;
   
    void displayInfo2(){
        
        displayInfo();
        System.out.println("Qualifications: "+qualifications);
    }
    
}
