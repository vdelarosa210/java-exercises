package Java2;

/**
 * Created by violet on 5/18/17.
 */
public class MoviesApplication {
    public static void main(String[] args) {

        MoviesArray listObject =
        MoviesArray listOfMovies = new MoviesArray();
        Movie[] listOfMovies;

        for

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


            //create Scanner
            switch (scan.nextInt()) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    printByCategory(listOfMovies, "animated");
                {
                    break;
                }
                case 2:
                    printByCategory(listOfMovies, "drama");
                {
                    break;
                    case 3:
                        printByCategory(listOfMovies, "horror");
                    {
                        break;
                    }
                    case 4:
                        printByCategory(listOfMovies, "scifi");
                    {
                        break;
                    }
                }
                default:
                    System.out.println("Your choice is not valid, please try again.");
            }

        }
    }

    public static void printByCategory(Movie[] movies, String category) {
        if (movie.getCategory().equalsIgnoreCase("animated")) {
            System.out.println(movie.getName() + " - " + movie.getCategory());
        }
    }

}

