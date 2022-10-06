package Week3Day4.File;
import java.io.*;
import java.util.*;

public class ReadingByte {
    public static void main(String[] args) throws IOException {
        /*try{
            File file = new File("hello.txt");
            Scanner reader = new Scanner(file);
            String line = reader.nextLine();
            System.out.println(line.charAt(0));
        } catch(FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }*/

        FileReader reader = new FileReader("burger.txt");
        char c = (char) reader.read();
        System.out.println(c);
    }
}
