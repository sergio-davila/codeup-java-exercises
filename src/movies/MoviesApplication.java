package movies;
import java.util.Scanner;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();
        System.out.println("Would you like to see the list of all the movies, or would you like to see them by genre?");
        System.out.println("Please input one of the following: 0 to not display anything.");
        System.out.println("1 to view all movies.");
        System.out.println("2 to view movies in the drama category.");
        System.out.println("3 to view movies in the musical category.");
        System.out.println("4 to view movies in the sci-fi category.");
        System.out.println("5 to view movies in the animated category.");

        String yOrN = sc.next();
        if (yOrN.equalsIgnoreCase("yes")) {
            for (Movie movie : movies) {
                System.out.println();
            }
        }


    }
}
