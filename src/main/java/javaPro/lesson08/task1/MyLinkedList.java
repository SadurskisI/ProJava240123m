package javaPro.lesson08.task1;

import java.util.Iterator;

public class MyLinkedList implements Iterable<String> {

    private int size = 0;
    private Node first;

    public void clear(){
        size = 0;
        first = null;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node current = first;
        while (current != null) {
            builder.append(current.data).append(", ");
            current = current.next;
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }

    public void add(String string) {
        if (isEmpty()) {
            first = new Node(string, null);

        } else {
            Node current = first;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            Node node = new Node(string, null);
            current.next = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException();
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<String> {
        private int cursor = 0;
        private Node current = first;


        @Override
        public boolean hasNext() {
            return current != null;
        }


        @Override
        public String next() {
            String result = current.data;
            current = current.next;
            return result;
        }
    }

    private class Node {

        private String data;
        private Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
