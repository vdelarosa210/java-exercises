package ConsoleExercises;

import java.util.Scanner;

/**
 * Created by violet on 5/10/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {

    Scanner data = new Scanner(System.in);

        int i = 5;

//        //=====while loop exercise=====//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//        //=====first part of do while loop exercise=====//
//        i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        }while (i <= 100);
//
//        //=====second part of do while loop exercise=====//
//
//        i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        }while (i >= -10);
//
//        //=====third part of do while loop exercise=====//
//
//        i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        }while (i >= -10);
//
//        long n = 2;
//
//        do {
//            System.out.println(n);
//            n = n * n;
//        }while(n < 1000000);
//
////=====Create above exercises with For Loop=====//
//        //=====Part 1=====//
//        for (i = 0; i <= 100; i +=2) {
//            System.out.println(i);
//        }
//
//        //=====Part 2=====//
//
//        for (i = 100; i>= -10; i-=5){
//            System.out.println(i);
//        }
//
//        //=====Part 3=====//
//
//        long b = 2;
//
//        for (b = 2; b < 1000000; b = b * b){
//            System.out.println(b);
//        }
//
//        //=====FizzBuzz test=====//
//
//
//        for (i = 0; i <= 100; i++){
//            if (((i % 3) == 0) & ((i % 5) == 0)) {
//                System.out.println("fizzbuzz");
//            }else if ((i % 3) == 0) {
//                System.out.println("fizz");
//            }else if ((i % 5) == 0) {
//                System.out.println("buzz");
//            }else System.out.println(i);
//        }
//
//        //=====Table of Powers=====//

//        int b = 1;
//
//        System.out.println("What number would you like to go up to?");
//        int num = data.nextInt();
//        System.out.println("number" + " | " + "squared" + " | " + "cubed");
//        while (b <= num) {
//            int sqr = b * b;
//            int cbd = b * b * b;
//            System.out.println(b + "      | " + sqr +  "       | " + cbd);
//            b++;
//        }

        //=====Grades=====//

        int g = 0;
        System.out.println("Please provide a grade between 0-100");
        int grd = data.nextInt();

        if (grd <= 60){
            System.out.println("F");
        } else if (grd >= 61 & grd <= 66){
            System.out.println("D");
        } else if (grd >= 67 & grd <= 79){
            System.out.println("C");
        } else if (grd >= 80 & grd <=87){
            System.out.println("B");
        } else if (grd >= 88){
            System.out.println("A");
        }

        }

    }

