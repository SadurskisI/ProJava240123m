package javaPro.lesson11.task2;

import javaPro.lesson10.task2.Cat;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Hello");
        stack.push("World");
        stack.push("I");
        stack.push("study");
        stack.push("Java");

        System.out.println(stack);

        String elem = stack.pop();
        System.out.println("Pop: " + elem);
        System.out.println(stack);

        elem = stack.pop();
        System.out.println("Pop: " + elem);
        System.out.println(stack);

        elem = stack.peek();
        System.out.println("Peek: " + elem);
        System.out.println(stack);





    }
}
