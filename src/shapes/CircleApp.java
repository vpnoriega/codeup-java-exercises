package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {
    public static void main(String [] args) {

        //prompt the user for radius using Input class
        double userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        userInput = sc.nextDouble();

        // create a circle object
        Circle circle = new Circle(userInput);

        //display the circumference and area
        System.out.printf("Your circle's area is: %.2f\n", circle.getArea());
        System.out.printf("Your circle's circumference: %.2f", circle.getCircumference());
    }
}