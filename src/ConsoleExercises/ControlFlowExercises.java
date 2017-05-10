package ConsoleExercises;

/**
 * Created by violet on 5/10/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {

        //first part of exercise//
        int i = 0;
        do {
            System.out.println(i);
            i+=2;
        }while (i <= 100);

        //second part of exercise//

        i = 100;
        do {
            System.out.println(i);
            i-=5;
        }while (i >= -10);

        // third part of exercise//

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
    }
}
