import java.util.Scanner;
import java.util.*;

public class vowelRemover {
    public static void main(String[] args) {
        StringBuilder[] countryName = new StringBuilder[10];

        Scanner sc = new Scanner(System.in);
//        System.out.println("How many Countries ");
//        int n = sc.nextInt();
        for (int i = 0; i < 2; i++) {

            System.out.println("Enter country " + (i+1));
            String s1 = sc.nextLine();
            countryName[i] = new StringBuilder(s1);
        }
        for (int i = 0; i < 2; i++) {

            for(int j=1;j<countryName[i].length();j++)
            {
                if(countryName[i].charAt(j) == 'a' || countryName[i].charAt(j)=='e' || countryName[i].charAt(j)=='i' || countryName[i].charAt(j)=='o' || countryName[i].charAt(j)=='u')
                {
                    countryName[i].deleteCharAt(j);
                }
            }

            System.out.println(countryName[i]);
        }

    }
}
