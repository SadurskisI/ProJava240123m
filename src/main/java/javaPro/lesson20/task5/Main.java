package javaPro.lesson20.task5;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        String input = br.readLine();
        System.out.printf("Input String - %s length - %d", input,input.length());
    }
}
