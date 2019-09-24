import java.io.*;
import java.util.Scanner;

public class convertUpper
{
    public static void main(String[] args) throws IOException {
        String fileName;
        String message;
        String fileName2;


        Scanner sc = new Scanner(System.in);         //declare initial file name, check if it exists
//        fileName = sc.nextLine();
        File file = new File("/home/cgi/Music/java/Assignment1/9copy/content.txt");
        System.out.println("Done");
//        while (!file.exists())
//        {
//            System.out.println("dont go");
//            file.createNewFile();
//        }
        PrintWriter file1writer =new PrintWriter(file);
        file1writer.println("hindustan zindabad");
        file1writer.close();

        Scanner fileToRead = new Scanner(file);
        PrintWriter fileToWrite = new PrintWriter("aIsNowUppercase.txt");

        while(fileToRead.hasNext())
        {
            fileToWrite.println ( fileToRead.next().toUpperCase());
        }
        fileToRead.close();
        fileToWrite.close();


    }
}
