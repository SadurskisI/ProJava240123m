package javaPro.lesson20.task6;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {

        File file = new File("testDir/testFile.txt");
        System.out.println("File exists? - " + file.exists());
        file.createNewFile();
        System.out.println("File exists? - " + file.exists());
        System.out.println();

        File file1 = new File("testDir/first/second/third/fourth/secondTest.txt");
//        System.out.println("File1 exists? - " + file1.exists());

        File file2 = new File("testDir/first");
        file2.mkdir();

        System.out.println("Object is file or directory?");
        System.out.println("Is it file? - "+ file2.isFile());
        System.out.println("Is it directory? - "+ file2.isDirectory());

    }
}
