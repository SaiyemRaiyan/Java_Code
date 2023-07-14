
package homework;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class LoopBreak {
     public static void main(String[] args)throws IOException {

        Scanner input = new Scanner(System.in);
        String FileName;

        double avg=0.0,count=0.0,sum=0.0;


        File myfile= new File("inputList.txt");
        File myfile2= new File("avg and sum.txt");
        Formatter formatter= new Formatter(myfile);
        Formatter formatter1= new Formatter(myfile2);

        while(input.hasNextDouble()){
            double num= input.nextDouble();

            if(num>=0){


                sum+=num;
                count++;
                avg=sum/count;
                formatter.format("%s\r\n",num);

            }
            else{

                System.out.println("you have entered " + count+" numbers");

                formatter1.format("%s %s\r\n",sum,avg);

                break;
            }


        }
        formatter.close();
        formatter1.close();


        Scanner read =new Scanner(myfile2);
        String fsum= read.next();
        String favg= read.next();
        System.out.println(" Sum= "+fsum+ " Avg= "+favg);
        read.close();




    }
}

