package Java1;

import java.util.Scanner;

/**
 * Created by violet on 5/12/17.
 */
public class GameDevelopment {

    public static void main(String[] args) {

        int random;
        int number;
        random = (int) (Math.random() * 100 + 1);
        System.out.println(random);
        Scanner data = new Scanner(System.in);
        System.out.println("Do you think you can guess what number I picked? If so, enter a number between 1 and 100");
        do {
            number = data.nextInt();
            if (number > random) {
                System.out.println("Almost. Pick another number LOWER than that");
            } else if (number < random) {
                System.out.println("Almost. Pick another number HIGHER than that");
            } else if (number == random) {
                System.out.println("GOOD GUESS!");
            }
        } while (number != random);


    }


}


