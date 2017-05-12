package ConsoleExercises;

import java.util.Scanner;

/**
 * Created by violet on 5/12/17.
 */
public class dice {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        String rollAgain;

        do{
            int number = sidesOfDice(data);
            System.out.println("The number for the first dice is " + (roll(number)));
            System.out.println("The number for the second dice is " + (roll(number)));
            System.out.println("Do you want to roll the dice again? (y/n)");
            rollAgain = data.next();
        }while (rollAgain.equalsIgnoreCase("y"));
    }
        //=====Number of Sides to the Dice=====//
        public static int sidesOfDice(Scanner input){
            System.out.println("Please enter a number of sides for a pair of dice?");
            return input.nextInt();
        }
        //=====Roll the dice to create a random number=====//
        public static int roll(int sides){
            return 1 + (int)(Math.random() * sides);
        }
}
