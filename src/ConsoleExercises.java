import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately: %.2f%n", pi );

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userNumber = sc.nextInt();
        System.out.printf("Thank you for entering an integer of %d.", userNumber);

        sc.nextLine();
        System.out.println("Please enter 3 words: ");
        String wordOne = sc.nextLine();
        String wordTwo = sc.nextLine();
        String wordThree = sc.nextLine();
        System.out.printf("You entered these 3 words: %s,%s, %s\n",wordOne,wordTwo,wordThree);

        System.out.println("Please type a sentence: ");
        String userSentence = sc.nextLine();
        System.out.printf("The sentence you wrote was: %s\n", userSentence);





    }
}
