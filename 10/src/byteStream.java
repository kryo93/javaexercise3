import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class byteStream
{
    public static void main(String[] args) {

        FileInputStream input = null;
        try {
            input = new FileInputStream("/home/cgi/Music/java/Exercise3/10/src/content.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int ch = 0;

        while(true)
        {
            try {
                if (!((ch=input.read())!=-1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print(ch);
        }

    }
}
