package javaPro.lesson06.task3;

import java.util.Arrays;

public class MyArrayList {

    private int size = 0;

    private String[] list =  new String[10];

    public void add(int index, String str){
        if (size > index) {
            list[index] = str;
            size++;
        }
    }

    public void add(String str){
        list[size++] = str;
    }

    public int size(){
        this.size = size;
        return size;
    }


}
