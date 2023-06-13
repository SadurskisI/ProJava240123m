package javaPro.lesson16.task1;

public class SecondFilter implements Filter{


    @Override
    public boolean test(Student student) {
        return student.getGender().equals(Gender.FEMALE) && student.getName().toLowerCase().contains("k");
    }
}
