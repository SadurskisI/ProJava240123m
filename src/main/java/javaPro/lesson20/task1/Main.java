package javaPro.lesson20.task1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.print("One! ");
        System.out.print("Two! ");
        System.out.print("Three! ");
        System.out.println();

        System.out.println("One! ");
        System.out.println("Two! ");
        System.out.println("Three! ");
        System.out.println();

        System.out.println("Символы %n и \\n переносит курсор на следующую строку");
        System.out.printf("One%nTwo%nThree%n");
        System.out.println();

        System.out.println("Подставляем в строку целочисленную переменную");
        int a = 5;
        int b = 3;
        System.out.printf("Сумма %d и %d равна %d\n",a,b, a+b);
        System.out.println();

        System.out.println("Подставляем в строку еще одну строку");
        String s = "Hi guys!";
        System.out.printf("String - %.2s\n",s); // %.2s выводит только 2 символа;
        System.out.println();

        System.out.println("Подставляем дробное число");
        System.out.printf("Число PI равно - %f\n", Math.PI);
        System.out.printf("Число PI округлённое - %.3f\n", Math.PI);
        System.out.println();

        System.out.println("Подставление boolean значения");
        boolean c = true;
        System.out.printf("Результат - %b\n",c);
        System.out.printf("Результат - %B\n",a < b);
        System.out.printf("Результат - %B\n", 7);
        System.out.printf("Результат - %b\n", "Hello");
        System.out.printf("Результат - %B\n", null);
        System.out.println();

        System.out.println("Подстановка в строку символа");
        char d = 'a';
        System.out.printf("Символ - %c\n",d);
        System.out.printf("Символ - %C\n",d);
        System.out.println();

        System.out.println("Дробные числа");
        double d1 = 1234.567;
        double d2 = 1234.5678912345;
        System.out.printf("%50.3f\n", d1);
        System.out.printf("%50.8f\n", d2);
        System.out.println();

        Date date = new Date();
        System.out.println(date);
        System.out.printf("Результат - %tT\n", date);
        System.out.printf("Часы - %tH, минуты - %tM, секунды - %tS\n", date,date,date);
        System.out.printf("%1$tA %1$td %1$tm %1$tY\n",date);
    }
}
