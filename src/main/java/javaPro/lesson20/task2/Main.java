package javaPro.lesson20.task2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Начало работы программы");
        System.out.println("Вызываем метод div");
        System.out.println(div(8,0));
        System.out.println("Конец работы программы");
    }
    public static int div(int x, int y){
        System.out.println("Начало работы метода");
        System.out.println("Проверка входящих данных");
        if (y == 0){
            System.err.println("Ошибка, нельзя делить на 0");
            y = 1;
        }
        int result = x/y;
        System.out.println("Конец работы метода");
        return result;
    }
}
