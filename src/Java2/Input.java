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
        return scan.nextInt();
    }

    public int getInt(int min, int max) {
        int n1 = this.getInt();

        if (n1 >= min && n1 <= max) {
            return n1;
        }
        System.out.println(n1 + " is out of range. Please try again.");
        return getInt(min, max);
    }

}

