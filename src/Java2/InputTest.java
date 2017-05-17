package Java2;

/**
 * Created by violet on 5/17/17.
 */
public class InputTest {

    public static void main(String[] args) {
        Input name = new Input();
        Input response = new Input();

        //=====Utilize String=====//
        System.out.println("What is your name?");
        System.out.println("Welcome " + name.getString());

        //=====Utilize Boolean=====//

        System.out.println("Do you mind answering a few more questions? (y/n)");
        System.out.println(response.yesNo());

        int min = 1;
        int max = 10;

        System.out.println("Please provide a number between " + min + " and " + max);
        System.out.println("The number you provided is " + response.getInt(min, max));


    }


}




