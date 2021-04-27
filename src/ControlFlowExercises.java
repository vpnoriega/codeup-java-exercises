import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        /** 1a. Loop Basics */

//      int i = 5;
//      while (i<=15){
//          System.out.println("i is " + i);
//            i++;
//      }


        /** 1b. Count by 2's starting 0 to 100: **/

//        int i=0;
//do {
//    System.out.println(i);
//    i+=2;
//
//        } while(i<=100); //the max number


        /** Count by 5's backwards from 100 to -10 **/

//        int i=100;
//do {
//    System.out.println(i);
//    i-=5;
//
//        } while(i >= -10); //the max number


        /** Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.*/

//        long i = 2;
//        do {
//    System.out.println(i);
//    i*=i;
//        } while (i<=1000000);


        /** 1c. Refactor the previous two exercises to use a for loop instead */

//        for (long i = 2; i < 1000000; i *=i){
//            System.out.println(i);
//        }


        /** 2. Fizzbuzz **/
        //Not the right answer, just kept for reference

//        int i = 0;
//        while (i<100) {
//            i++;
//        if (i % 3 == 0) {
//            if (i % 5 == 0) {
//               System.out.println("fizzbuzz");
//            } else {
//                System.out.println("fizz"); }
//        } else if (i % 5 == 0) {
//            System.out.println("buzz");
//        } System.out.println(i);
//        }

// Correct Answer refactored:

//        for (int i = 1; i<100; i++) {
//            //System.out.println(i);
//            if (i % 15 == 0) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            else {
//                System.out.println(i); //this replaces it because it does meet the condition listed above
//            }
//        }


        /** 3. Display a table of powers. */

        Scanner sc = new Scanner(System.in);
        boolean confirmation;
        do {
            System.out.print("Enter an integer: ");
            int userNumber = sc.nextInt();
            double userSquared = (Math.pow(userNumber, 2));
            double userCubed = (Math.pow(userNumber, 3));

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userNumber; i++) {

                System.out.println(userNumber + "      |" + userSquared + "      |" + userCubed);
            }

            System.out.print("Continue? [y/n]\n");
            String userInput = sc.next();
            confirmation = userInput.equalsIgnoreCase("y");


        } while(confirmation);




    }
}
