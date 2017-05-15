package ConsoleExercises;

import java.util.Scanner;

/**
 * Created by violet on 5/15/17.
 */


public class store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mainMenuSelect;

        String shop = "nothingToPrint";

        String wantsToReturnToMainMenu;

        do {

            System.out.println("Please select an option: ");
            System.out.println("1. Sale");
            System.out.println("2. Print Receipt");
            System.out.println("3. Exit");

            mainMenuSelect = input.nextInt();

            if (mainMenuSelect == 1) {
                shop = "Item name | Cost | Quantity\n";
                Double total = 0.0;
                do {
                    String item = item((input));
                    Double cost = cost(input);
                    int quantity = quantity(input);
                    total += cost * quantity;
                    shop += item + " " + "$" + cost + " " + quantity + "\n";
                    System.out.println("Would you like to purchase another item? (y/n)");

                } while (input.next().equalsIgnoreCase("y"));
                shop += "\n Total: " + total;
            }

            if (mainMenuSelect == 2) {
                receipt(shop);
            }
            if (mainMenuSelect == 3) {
                System.out.println("Thank you, come again.");
                System.exit(0);
            }

            System.out.println("Would you like to go back to the main menu? (y/n)");
            wantsToReturnToMainMenu = input.next();
        } while (wantsToReturnToMainMenu.equalsIgnoreCase("y"));

    }


    public static String item(Scanner input) {
        System.out.println("What would you like to purchase?");
        return input.next();
    }

    public static Double cost(Scanner input) {
        System.out.println("What is the cost of the item?");
        return input.nextDouble();
    }

    public static int quantity(Scanner input) {
        System.out.println("How many would you like to buy?");
        return input.nextInt();
    }

    public static void receipt(String shop) {
        System.out.println(shop);
    }

}
