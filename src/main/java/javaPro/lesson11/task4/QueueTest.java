package javaPro.lesson11.task4;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueTest {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Hello");
        queue.add("World");
        queue.add("I");
        queue.add("Study");
        queue.add("Java");

        System.out.println(queue);

        String result = queue.poll();
        System.out.println(result);

        result = queue.peek();
        System.out.println(result);

//        while(!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }




    }
}
