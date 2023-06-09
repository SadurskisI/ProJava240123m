package javaPro.lesson17.task8;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // Используя функциональный интерфейс, написать функцию,
        // которая принимает запрос и возвращает строку в виде:
        // {Получен запрос: сообщение - [здесь_текст_сообщения], отправитель - [здесь_ид_отправителя]}
        // Написать метод, который принимает запрос и данную функцию и выводит результат в консоль.


        Function<Request, String> function = x -> String.format("{Получен запрос: сообщение - [%s], отправитель - [%d]}",
                x.getMessage(),x.getSenderId());
        formNewRequest(new Request("Hello world",1),function);


    }

    public static void formNewRequest(Request request, Function<Request,String> function){
        System.out.println(function.apply(request));
    }
}
