
package javacode;


public class Divisableby3 {
    public static void main(String[] args) {
        int n =0;
        while(n<=20)
        {
            n++;
            if(n%3 == 0)
                continue;
            System.out.println("The Number:"+n);
        }
    }
    
}
