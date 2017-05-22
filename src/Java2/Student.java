package Java2;

import java.util.ArrayList;

/**
 * Created by violet on 5/22/17.
 */
public class Student {

    private String studentName;
    private int studentGrade;

    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(78);
        grades.add(89);
        grades.add(90);
        System.out.println(grades.size());

    }



    //=====Constructor=====//
    public Student(String studentName, int studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    //=====returns the student's name=====//
    public String getName(){
        return studentName;
    }

    // adds the given grade to the grades property
    public void addGrade() {
        addGrade();
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return 0;
    }

}
