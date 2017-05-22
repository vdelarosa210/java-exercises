package Java2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by violet on 5/22/17.
 */
public class GradesApplication {
    public static void main(String[] args) {

        ArrayList<Student> Students = new ArrayList<Student>();

        Student Violet = new Student("Violet");
        Violet.addGrade(100);
        Violet.addGrade(90);
        Violet.addGrade(80);
        Violet.addGrade(95);

        System.out.println(Violet.getGradeAverage());


//        Map students = new HashMap(, 89);
//
//        students.put(Vi);
//
//        System.out.println(students.get("Vi"));
    }
}
