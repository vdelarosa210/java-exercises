package Java1;

import java.util.Scanner;

/**
 * Created by violet on 5/11/17.
 */
public class StringExercise {
    public static void main(String[] args) {
        String message = ("We don't need no education \n" + "We don't need no thought control\n");
        message += ("Check \"this\" out!, \"s inside of \"s!\n");
        message += ("In windows, the main drive is usually C:'\'\n");
        message += ("I can do backslashes '\\', double backslashes '\\\\', and the amazing triple backslash '\\\\\\'!");
        System.out.println(message);

        //=====Talk to Bob Exercise=====//

        Scanner data = new Scanner(System.in);
        System.out.println("Talk to Bob:");
        String resp = data.nextLine();
        if (resp.endsWith("?")){
            System.out.println("Sure. ");
        } else if (resp.isEmpty()){
            System.out.println("Fine. Be that way!");
        } else if (resp.endsWith("!") || resp.toUpperCase().equals(resp) && !resp.toLowerCase().equals(resp)){
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever");
        }
    }
}
