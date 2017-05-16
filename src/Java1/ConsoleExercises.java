package Java1;

import java.util.Scanner;

/**
 * Created by violet on 5/8/17.
 */
public class ConsoleExercises {

    public static void main(String[] args){

     Scanner scan = new Scanner(System.in);

     int zip;

        System.out.println("What zip code do you live in: ");

        zip = scan.nextInt();

        System.out.println("You live in " + zip);

    String firstName;
    String middleName;
    String lastName;

        System.out.println("What is your full name?");
        firstName = scan.next();
        middleName = scan.next();
        lastName = scan.nextLine();
        System.out.println("Your name is " + firstName + " "  + middleName  + lastName);

    String sentence;

        System.out.println("Describe what your neighborhood is like in a complete sentence");
        sentence = scan.nextLine();
        System.out.println("You said, " + sentence);

    int length;
    int width;

        System.out.println("Let's find out the size of your classroom. What is the length of your classroom in feet?");
        length = scan.nextInt();
        System.out.println("What is the width of the classroom in feet?");
        width = scan.nextInt();
        int perimeter = 2 * length + 2 * width;
        System.out.println("So the area of your classroom is " + length * width + " squared feet." + " The perimeter of your classroom is " + perimeter + " feet");
    }

}
