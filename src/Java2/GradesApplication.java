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



        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");
        System.out.println(students.keySet());
        System.out.println("Which student would you like to know more information about?");

        System.out.println("Would you like to see another student? (y/n)");

    }

    public static Boolean confirm(Scanner input, String message) {
        System.out.println(message);
        String yn = input.next();

        if (!yn.equalsIgnoreCase("y") && !yn.equalsIgnoreCase("n")) {

            System.out.println("Sorry, I didn't catch that.");
            return confirm(input, message);
            // ask question again
        }
        return yn.equalsIgnoreCase("y");
    }}





