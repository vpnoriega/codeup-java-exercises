package movies;
import util.Input;
import java.util.Scanner;

/** Create a class named MoviesApplication that has a main method: */
public class MoviesApplication {
    public static void main(String[] args) {

/**Give the user a list of options for viewing all the movies or viewing movies by category:*/

    Scanner sc = new Scanner(System.in);
    int userInput;
    Movie[] list = MoviesArray.findAll(); //object array of Movie, called list is assigned to the findAll method

        System.out.println("It's movie time! What would you like to do?");
        while(true){
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            userInput = sc.nextInt();
            if(userInput ==0){
                break;

            }

        }

        
    }
}