package Java2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by violet on 5/22/17.
 */
public class GradesApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Student> Students = new ArrayList<Student>();

        Student Violet = new Student("Violet");
        Violet.addGrade(95);
        Violet.addGrade(90);
        Violet.addGrade(82);

        Student Aris = new Student("Aris");
        Aris.addGrade(78);
        Aris.addGrade(88);
        Aris.addGrade(95);

        Student Isaac = new Student("Isaac");
        Isaac.addGrade(65);
        Isaac.addGrade(76);
        Isaac.addGrade(87);

        Student Jovani = new Student("Jovani");
        Jovani.addGrade(99);
        Jovani.addGrade(88);
        Jovani.addGrade(77);


//        System.out.println("The grade point average for Violet is " + Violet.getGradeAverage());
//        System.out.println("The grade point average for Aris is " + Aris.getGradeAverage());
//        System.out.println("The grade point average for Isaac is " + Isaac.getGradeAverage());
//        System.out.println("The grade point average for Jovani is " + Jovani.getGradeAverage());


        Map students = new HashMap();

        students.put("vdelarosa210", 89);
        students.put("Arisdcks", 87);
        students.put("Isaac620", 76);
        students.put("Jovaniatx", 88);



        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");
        System.out.println(students.keySet());
        System.out.println("Which student would you like to know more information about?");


        System.out.println("Would you like to see another student? (y/n)");

    }

}





