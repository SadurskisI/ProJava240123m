package javaPro.lesson10.task2;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {


    @Override
    public int compare(Cat cat1, Cat cat2) {
        if (cat1.getAge() != cat2.getAge()) {
            return cat1.getAge() - cat2.getAge();
        }if (Double.compare(cat1.getWeight(), cat2.getWeight()) != 0) {
            return Double.compare(cat1.getWeight(), cat2.getWeight());
        }if (cat1.getColor() != null) {
            return cat1.getColor().compareTo(cat2.getColor());
        }
        return 0;
    }
}
