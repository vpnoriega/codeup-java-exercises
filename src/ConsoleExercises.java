import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s.", pi ); //can't figure out the format part

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userNumber = sc.nextInt();
        System.out.printf("Thank you for entering an integer of %d.", userNumber);


    }
}
