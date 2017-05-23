package Java2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by violet on 5/22/17.
 */
public class Student {

    private String name;
    private ArrayList<Integer> grades;

    //=====Constructor=====//
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    //=====returns the student's name=====//
    public String getName() {
        return this.name;
    }

    //=====adds the given grade to the grades property=====//
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    //=====returns the average of the students grades=====//
    public double getGradeAverage() {
        double sum = 0;
        for(int grade: this.grades){
            sum += grade;
        }
        return(sum/this.grades.size());
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
    }

}
