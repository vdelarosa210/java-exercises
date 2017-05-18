package Java2;

/**
 * Created by violet on 5/18/17.
 */
public class MoviesApplication {
    public static void main(String[] args) {

        while (true) {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category)");
            System.out.println("Please choose one");

            switch (scan.nextInt()) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for (Movie movie: listOfMovies) {
                        System.out.println(movie.getName() + " - " + movie.getCategory);
                    }
                case 2:
                default:
            }

        }


    }
}
