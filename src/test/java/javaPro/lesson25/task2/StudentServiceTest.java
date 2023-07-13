package javaPro.lesson25.task2;



import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class StudentServiceTest {

    @BeforeClass
    public static void init() {
        Student student1 = new Student("Ivan",20,Degree.MASTER);
        Student student2 = new Student("Max",40,Degree.MASTER);
        Student student3 = new Student("John",30,Degree.BACHELOR);
        Student student4 = new Student("Oleg",50,Degree.BACHELOR);
    }

    @Test
    public void getStudentByDegree(){
        int expected = 2;
        int actual = StudentService.getStudentByDegree(Degree.BACHELOR);
        assertEquals(expected,actual);
    }
    @Test
    public void getAllStudentTest(){
        assertNotNull(StudentService.getAllStudents());
    }

    @Test
    public void getStudentsNumber(){
        int expected = 4;
        int actual = StudentService.getStudentsNumber();
        assertEquals(expected,actual);
    }


    @Test
    public void getAvgAge(){
        int expected = 140/4;
        int actual = StudentService.getStudentAvgAge();
        assertEquals(expected,actual);
    }

    @Test
    public void getAvgAgeByGrade(){
        int expected = 30;
        int actual = StudentService.getStudentAvgAgeByDegree(Degree.MASTER);
        assertEquals(expected,actual);
    }
    @Test
    public void getListOfStudent(){
        assertNotNull(StudentService.getStudentListByDegree(Degree.BACHELOR));
    }
}