package javaPro.lesson21.task4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
//        1. Создать папку.
//        2. В этой папке создать несколько файлов с разными расширениями -
//        .txt, .doc, .PNG, .AVI, .jpg, .JPEG и т.д.
//        3. Вывести в консоль список всех файлов изображений
//        (учитывать, что расширение может быть написано в разных регистрах).

        File dir = new File("taskDir");
        dir.mkdir();

        File fileTxt = new File("taskDir/test.txt");
        fileTxt.createNewFile();
        File fileDoc = new File("taskDir/test.doc");
        fileDoc.createNewFile();
        File filePng = new File("taskDir/test.PNG");
        filePng.createNewFile();
        File fileJpeg = new File("taskDir/test.JPEG");
        fileJpeg.createNewFile();
        File fileJpg = new File("taskDir/test.jpg");
        fileJpg.createNewFile();
        File fileAvi = new File("taskDir/test.AVI");
        fileAvi.createNewFile();

        printImageFilesFromDir(dir.listFiles());
    }

    public static void printImageFilesFromDir(File[] filesArray) {
        try {
            for (File filename : filesArray) {
                int pointIndex = filename.getName().lastIndexOf('.');
                if (filename.getName().toLowerCase().substring(pointIndex+1).contains("jpeg") ||
                        filename.getName().toLowerCase().substring(pointIndex +1).contains("png") ||
                        filename.getName().toLowerCase().substring(pointIndex +1).contains("jpg")) {
                    System.out.println(filename.getName());
                }
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
