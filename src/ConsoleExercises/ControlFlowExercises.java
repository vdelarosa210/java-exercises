package ConsoleExercises;

/**
 * Created by violet on 5/10/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;

        //=====while loop exercise=====//
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        //=====first part of do while loop exercise=====//
        i = 0;
        do {
            System.out.println(i);
            i+=2;
        }while (i <= 100);

        //=====second part of do while loop exercise=====//

        i = 100;
        do {
            System.out.println(i);
            i-=5;
        }while (i >= -10);

        //=====third part of do while loop exercise=====//

        i = 100;
        do {
            System.out.println(i);
            i-=5;
        }while (i >= -10);

        long n = 2;

        do {
            System.out.println(n);
            n = n * n;
        }while(n < 1000000);

//=====Create above exercises with For Loop=====//
        //=====Part 1=====//
        for (i = 0; i <= 100; i +=2) {
            System.out.println(i);
        }

        //=====Part 2=====//

        for (i = 100; i>= -10; i-=5){
            System.out.println(i);
        }

        //=====Part 3=====//

        long b = 2;

        for (b = 2; b < 1000000; b = b * b){
            System.out.println(b);
        }

        //=====FizzBuzz test=====//


        for (i = 0; i <= 100; i++){
            if (((i % 3) == 0) & ((i % 5) == 0)) {
                System.out.println("fizzbuzz");
            }else if ((i % 3) == 0) {
                System.out.println("fizz");
            }else if ((i % 5) == 0) {
                System.out.println("buzz");
            }else System.out.println(i);
        }

        //=====Table of Powers=====//




    }
}
