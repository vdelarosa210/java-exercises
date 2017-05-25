package Java2;

import java.util.Scanner;

/**
 * Created by violet on 5/17/17.
 */
public class Input {

    private Scanner scan;

    //======Constructor======//
    public Input() {
        this.scan = new Scanner(System.in);
    }

    public String getString() {

        return scan.next();
    }

    public boolean yesNo() {
        String answer = this.getString();
        if (answer.equalsIgnoreCase("y") || (answer.equalsIgnoreCase("yes"))) {
            return true;
        }
        return false;
    }

    public int getInt() {
        try {
            return Integer.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("Please enter *an integer*");
        }
        return getInt();
    }

    //=====Getter for Int=====//
    public int getInt(int min, int max) {
        int n1;
        try {

            n1 = Integer.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer between " + min + " and " + max + ": ");
            return getInt(min, max);
        }
        if (n1 >= min && n1 <= max) {
            return n1;
        }
        System.out.println(n1 + " is out of range. Please try again.");
        return getInt(min, max);
    }

    public double getDouble() {
        try {
            return Double.valueOf(this.getString());
        }catch (NumberFormatException e){
            System.out.println("Please enter *a Double*");
        }
        return getDouble();
    }

    //=====Getter for Double=====//
    public double getDouble(double min, double max) {
        double n1 = this.getDouble();
        if (n1 >= min && n1 <= max) {
            return n1;
        }
        System.out.println(n1 + " is out of range. Please try again.");
        return getDouble(min, max);

    }

}

