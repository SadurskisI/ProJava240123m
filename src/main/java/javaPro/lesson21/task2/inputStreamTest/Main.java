package javaPro.lesson21.task2.inputStreamTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("testDir/test.txt");

        try (FileInputStream in = new FileInputStream("testDir/test.txt");
             FileInputStream in1 = new FileInputStream(file)) {

            System.out.println("Byte left - " + in.available());

            System.out.println("Skip 15 bytes");
            in.skip(15);

            System.out.println("Bytes left - " + in.available());

            System.out.println("Info from file " + (char) in.read());

            System.out.println("Read all left info: ");


            int data = in.read();
            while (in.available() > 0) {
                System.out.print((char) data);
                data = in.read();
            }
            System.out.print((char) data);


            System.out.println();
            System.out.println("Log bytes array in console");
            byte[] bytes = in1.readAllBytes();
            for (byte current : bytes){
                System.out.print((char) current);
            }

        } catch (Exception e) {
            System.out.println("Error!");
        }

    }
}
