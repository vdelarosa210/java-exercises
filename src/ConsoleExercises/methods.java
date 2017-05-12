package ConsoleExercises;

import java.util.Scanner;

/**
 * Created by violet on 5/11/17.
 */
public class methods {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int n1, n2;

        do {
            n1 = askForNumber(data);
        } while (confirm(n1) == false);

        do {
            n2 = askForNumber(data);
        } while (confirm(n2) == false);

        int result = addition(n1, n2);
        System.out.println(result);

        result = subtraction(n1, n2);
        System.out.println(result);

        result = multiplication (n1, n2);
        System.out.println(result);

        System.out.println(division(n1,n2));
    }

    //=====requests for a number to be entered=====//
    public static int askForNumber(Scanner input) {
        System.out.println("Enter a number between 1 and 10");
        return input.nextInt();
    }

    //=====confirms that the number is between 1-10=====//
    public static boolean confirm(int number) {
        if (number >= 1 && number <= 10) {
            return true;
        } else {
            System.out.println("The number is not between 1 and 10, please try again.");
            return false;
        }

    }
//=====use for loop to calculate factorial=====//

//    public static void factorial (+ - * /)


    //=====addition=====//
    public static int addition(int n1, int n2) {
        return (n1 + n2);
    }

    //=====subtraction=====//
    public static int subtraction(int n1, int n2) {
        return (n1 - n2);
    }

    //=====multiplication=====//

    public static int multiplication(int n1, int n2) {
        return (n1 * n2);
    }

    //=====division====//

    public static float division(int n1, int n2) {
        return  (float) n1 / (float) n2;
    }


}


