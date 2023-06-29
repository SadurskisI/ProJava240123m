package javaPro.lesson21.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamTest {

    public static void main(String[] args) throws IOException {

        File file = new File("testDir/output.txt");
        file.createNewFile();


        try (FileOutputStream out = new FileOutputStream(file,false);
             Scanner scanner = new Scanner(System.in)) {

//            out.write('H');
//            while (true){
//                out.write(scanner.nextLine().charAt(0));
//            }

            String text = "Hello world!";
            byte[] bytes = text.getBytes();

            out.write(bytes);
            out.write(bytes,0,6);

        } catch (Exception e){
            System.out.println("Error!");
        }
    }
}
