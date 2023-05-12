package javaPro.homeworks.homework4.task2;

public class Students {
    String firstName;
    String lastName;

    int classNumber;
    double averageNote;

    public Students(String firstName, String lastName, int classNumber, double averageNote) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classNumber = classNumber;
        this.averageNote = averageNote;
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classNumber=" + classNumber +
                ", averageNote=" + averageNote +
                '}';
    }
}
