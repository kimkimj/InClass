package Week3Day4.File;

import java.io.*;

public class CurrentDirectory {
    public static void main(String[] args) {
        // ./ means current directory
        File dir = new File("./");

        // store all the files in an array
        File files[] = dir.listFiles();

        // Print every file in the current directory
        for (File file: files) {
            System.out.println(file);
        }
    }
}

/*
.\.git
.\.idea
.\burger.txt
.\InClass.iml
.\out
.\src
 */
