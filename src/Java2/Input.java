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
        } return false;
    }


}



