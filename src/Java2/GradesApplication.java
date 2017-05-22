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


        Map students = new HashMap();

        students.put("Aris", 90);
        students.put("Isaac", 75);
        students.put("Jovani", 88);
        students.put("Jonathan", 95);


        System.out.println(students.get("Which student would you like to know more information about?"));
    }
}
