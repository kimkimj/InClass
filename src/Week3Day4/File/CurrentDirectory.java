package Week3Day4.File;

import java.io.*;

public class CurrentDirectory {
    public static void main(String[] args) {
        File dir = new File("./");
        File files[] = dir.listFiles();

        // Print every file in the current directory
        for (File file: files) {
            System.out.println(file);
        }
    }
}
