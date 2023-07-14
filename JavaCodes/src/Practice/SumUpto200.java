
package javacode;


public class SumUpto200 {
    public static void main(String[] args) {
        
        int n =0, sum = 0;
        while(n<30)
        {
            sum +=n;
            n++;
            if(sum >= 200)
                break;
        }
        System.out.println("The number is: "+n);
        System.out.println("The sum is: "+sum);
        
    }
}
