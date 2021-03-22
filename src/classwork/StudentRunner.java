package classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        Student sam = new Student("Sam", 20);
        Student alex = new Student("Alex", 30);

        List<Student> students = new ArrayList<>();
        students.add(sam);
        students.add(alex);

        Student sam1 = new Student("Sam", 19);

        System.out.println("students = " + students.contains(sam));
        System.out.println("students = " + students.contains(sam1));

        students.add(sam1);
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students, new SortByAge());
        System.out.println(students);
    }
}
