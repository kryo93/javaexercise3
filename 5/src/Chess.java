public class Chess
{
    public static void main(String[] args) {
        String [][] chessBoard = new String[8][8];
        System.out.println();
        for (int i=0; i<8;i++)
        {
            for (int j=0;j<8;j++)
            {
                if(j%2==0) {
                    System.out.print("BB|");
                }
                else
                    System.out.print("WW|");
            }
            System.out.print("\n");
        }
    }
}
