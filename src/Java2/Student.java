package Java2;

import java.util.ArrayList;

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

}
