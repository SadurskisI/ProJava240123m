package javaSummary.lesson02;

import javaPro.lesson4.task5.Author;
import javaPro.lesson4.task5.Book;

public class CloneExample {
    public static void main(String[] args) {
        String x = "Text1";

        String y = x;

        System.out.println(y);

        Author author = new Author("Fenimor Kuper");

        System.out.println(author);

        Author author2 = author;
        System.out.println(author2);

        author2.setName("Swift");

        System.out.println(author);

//        ======================================

        Book book1 = new Book("Guliver",new Author("Swift"));

        System.out.println(book1);


    }
}
