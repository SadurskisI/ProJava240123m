package algorithms.lesson06;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private int count;
    private ArrayList<T> items;

    public Stack(){
        this.count = 0;
        this.items = new ArrayList<T>();
    }
    public void push(T element){
        this.items.add(element);
        this.count++;
    }

    public T pop(){
        if (this.count==0){
            throw new EmptyStackException();
        }
        T deleteItem = this.items.remove(this.count-1);
        this.count--;
        return deleteItem;
    }

    public T peek(){
        return this.items.get(items.size()-1);
    }

    public boolean isEmpty(){
        return this.count == 0;
    }

    public int size(){
        return this.count;
    }

    public void clear(){
        items.clear();
        this.count = 0;
    }



    @Override
    public String toString() {
        return "Stack{" +
                "items=" + items +
                '}';
    }
}
