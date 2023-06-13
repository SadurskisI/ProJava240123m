package javaPro.lesson16.task1;
@FunctionalInterface
public interface Filter {

    boolean test(Student student);
//    В функциональном интерфейсе может быть только один абстрактный метод
//    void test(int i);
}
