import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class consecutiveNumber
{
    public static void main(String[] args)
    {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        s1 = sc.nextLine();

           String[]  queryword   = s1.split(",");
            int flg = 1;
           for(int i=0;i<queryword.length-1;i++)
           {
               int iTest = Integer.parseInt(queryword[i]);
               int iTest1 = Integer.parseInt(queryword[i+1]);



               if((iTest+1) != iTest1 && (iTest)-1 != iTest1)
               {
                   System.out.println("Not consecutive");
                   flg=0;
               }
           }
           if(flg==1)
            System.out.println("consecutive");


    }
}
