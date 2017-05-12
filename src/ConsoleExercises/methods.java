package ConsoleExercises;

import java.util.Scanner;

/**
 * Created by violet on 5/11/17.
 */
public class methods {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        String wantsToContinue;
        do {

            int n1, n2;

            do {
                n1 = askForNumber(data);
            } while (confirm(n1) == false);

            do {
                n2 = askForNumber(data);
            } while (confirm(n2) == false);

            int result = addition(n1, n2);
            System.out.println(n1 + " + " + n2 + " = " + result);

            result = subtraction(n1, n2);
            System.out.println(n1 + " - " + n2 + " = " + result);

            result = multiplication(n1, n2);
            System.out.println(n1 + " * " + n2 + " = " + result);

            System.out.println(n1 + " / " + n2 + " = " + division(n1, n2));

            result = modulus(n1, n2);
            System.out.println("The modulus of " + n1 + " & " + n2 + " = " + result);

            result = factorial(n1);
            System.out.println("The factorial of " + n1 + "! = " + result);

    //=====ask if they want to continue=====//
            System.out.println("Do you want to continue? (y/n)");
            wantsToContinue = data.next();
        } while (wantsToContinue.equalsIgnoreCase("y"));

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
        return (float) n1 / (float) n2;
    }

    //=====modulus=====//
    public static int modulus(int n1, int n2) {
        return (n1 % n2);
    }

    //=====factorial=====//
    public static int factorial(long n1) {
        int result = 1;
        for (int i = 1; i <= n1; i++){
            result = result * i;
        }
        return (result);
    }

}


