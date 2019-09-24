import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class frequencyCalculator
{
    public static void main(String[] args) throws IOException {
        File readFile = new File("/home/cgi/Music/java/Exercise3/11/src/demo.txt");
        Scanner inReader = new Scanner(readFile);
       String str = "";

        while(inReader.hasNext())
        {
           str += inReader.nextLine();
        }
        System.out.println(str);
        String[] queryWord=str.split("\\s*(=>|,|\\s)\\s*");

        inReader.close();
        Map<String,Integer> datamap = new HashMap<>();
//

        for (String s : queryWord) {
            datamap.put(s, 0);
        }


        for (String s : queryWord) {
            int old = datamap.get(s);

            datamap.put(s, old + 1);
        }
        System.out.println(datamap);

    }
}
