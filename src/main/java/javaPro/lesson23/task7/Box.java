package javaPro.lesson23.task7;

import java.util.ArrayList;
import java.util.List;

public class Box <E extends Fruit> {



    List<E> fruitBox = new ArrayList<>();


    public boolean compare(Box<? extends Fruit> box){
        if (box.getWeight() == this.getWeight()){
            return true;
        } else return false;
    }

    public void add(E e){
        fruitBox.add(e);
    }

    public float getWeight(){
        if(fruitBox.isEmpty()) return 0;
        return fruitBox.size() * fruitBox.get(0).weight;
    }

    public void move(Box<E> newBox){
        this.fruitBox.addAll(newBox.fruitBox);
        newBox.fruitBox.clear();
    }
}
