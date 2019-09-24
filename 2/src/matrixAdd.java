import java.util.Scanner;
import java.util.SortedMap;

public class matrixAdd
{
    public static void main(String[] args)
    {
        int row;
        int col;
        System.out.println("Enter the number of rows ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        System.out.println("Enter the number of rows ");
        col = sc.nextInt();

        int [][] mat1 = new int[row][col];
        int [][] mat2 = new int[row][col];

        System.out.println("enter the first matrix ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        int [][] sum = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j]=mat2[i][j]+mat1[i][j];
                System.out.print(sum[i][j] +" ");
            }
            System.out.print("\n");
        }


    }
}