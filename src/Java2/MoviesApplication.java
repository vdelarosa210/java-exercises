package Java2;

/**
 * Created by violet on 5/18/17.
 */
//public class MoviesApplication {
//    public static void main(String[] args) {
//
//        MoviesArray listObject = new MoviesArray();
//        Movie[] listOfMovies = listObject.findAll();
//        Scanner scan = new Scanner(System.in);
//

//        while (true) {
//            System.out.println("What would you like to do?\n" +
//                    "\n" +
//                    "0 - exit\n" +
//                    "1 - view all movies\n" +
//                    "2 - view movies in the animated category\n" +
//                    "3 - view movies in the drama category\n" +
//                    "4 - view movies in the horror category\n" +
//                    "5 - view movies in the scifi category)");
//            System.out.println("Please choose one");
//
//            //create Scanner
//            int option = scan.nextInt();
//            scan.nextLine();
//
//
//            switch (option) {
//                case 0:
//                    System.exit(0);
//                    break;
//                case 1:
//                    printByCategory(listOfMovies, "animated");
//                {
//                    break;
//                }
//                case 2:
//                    printByCategory(listOfMovies, "drama");
//                {
//                    break;
//                    case 3:
//                        printByCategory(listOfMovies, "horror");
//                    {
//                        break;
//                    }
//                    case 4:
//                        printByCategory(listOfMovies, "scifi");
//                    {
//                        break;
//                    }
//                    case 5:
//                        printByCategory(listOfMovies, "scifi");
//                        break;
//                    case 6:
//                        listOfMovies = addMovie(scan, listOfMovies);
//                        break;
//                }
//                default:
//                    System.out.println("Your choice is not valid, please try again.");
//            }
//
//        }
//    }
//
//    //Prints the list of movies by a specific category
//    public static void printByCategory(Movie[] movies, String category){
//
//        for(Movie m : movies){
//            if(m.getCategory().equalsIgnoreCase(category)){
//                System.out.println( m.getName() + " - " + m.getCategory() );
//            }
//        }
//
//    }
//
//    // Adds a new Movie object to the list of movies array and returns it so it could be used in the main method
//    public static Movie[] addMovie(Scanner scan, Movie[] listOfMovies){
//
//        System.out.println("Give me the name:");
//        String name = scan.nextLine();
//
//        System.out.println("Give me the category:");
//        String category = scan.nextLine();
//
//        Movie newMovie = new Movie(name, category);
//
//        //Makes a copy of the array and adds a new index position so we can add the new Movie object
//        listOfMovies = Arrays.copyOf(listOfMovies, listOfMovies.length+1);
//        listOfMovies[listOfMovies.length-1] = newMovie;
//        return listOfMovies;
//    }
//
//}
//
