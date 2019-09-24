import java.util.Scanner;

public class grader
{
    private int studNumber;
    private int[] studGrade= new int[100];

    public void getstudNumber(int n)
    {
        this.studNumber=n;
    }


    public void getGrade(int x, int index)
    {
        studGrade[index]=x;
    }

    public void showGrades()
    {
        for(int i=0;i<studNumber;i++)
        {
            System.out.println("The Grade for Student " + (i+1) + " is " + studGrade[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number of Students ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        grader obj = new grader();
        obj.getstudNumber(input);
        for(int i=0;i<input;i++)
        {
            int x=0;
            int p;
            do {
                x=0;
                System.out.println("Enter the Grade for Student " + (i+1));
                p = sc.nextInt();
                try {
                    if (p < 0 || p > 100) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Entry, Please Try again");
                    x++;
                }
            }
            while (x!=0);
            obj.getGrade(p,i);
        }
        obj.showGrades();
    }
}
