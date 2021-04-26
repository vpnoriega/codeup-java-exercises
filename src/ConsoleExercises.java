import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        /** Section 1 */
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately: %.2f%n", pi );

        /** Section 2: Scanner Class */

        //1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userNumber = sc.nextInt();


        //2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        //My answer:
        //System.out.printf("Thank you for entering an integer of %d.", userNumber);
        //Douglas answer: either way, it is correct
        // System.out.println("Thank you for entering an integer of " + userNumber);


        //3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        System.out.println("Please enter 3 words: ");
//        String wordOne = sc.next(); // NEXT only captures ONE word
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//        System.out.format("%s\n%s\n%s\n",wordOne,wordTwo,wordThree);


        //4. Rewrite the above example using the nextLine method
//        System.out.println("Please type a sentence: ");
//        String userSentence = sc.nextLine();
//        System.out.printf("The sentence you wrote was: %s\n", userSentence);


        /** Section 3 Calculate */

        //1. Prompt the user to enter values of length and width of a classroom at Codeup. Use the nextLine method to get user input and parse the resulting string to a numeric type.

        System.out.println("Enter the length of the classroom: ");
        int length = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the width of the classroom: ");
        int width = Integer.parseInt(sc.nextLine());


       //2. Display the area and perimeter of that classroom.

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.printf("The area is: %d\n", area);
        System.out.printf("The perimeter is %d\n", perimeter);



    }
}
