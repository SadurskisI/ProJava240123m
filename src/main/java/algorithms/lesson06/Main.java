package algorithms.lesson06;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.clear();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
