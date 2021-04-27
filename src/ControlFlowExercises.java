import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        /** 1a. Loop Basics */

//      int i = 5;
//      while (i<=15){
//          System.out.println("i is " + i);
//            i++;
//      }


        /** 1b. Do While: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line. **/

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2; //increment by 2's
//
//        } while (i <= 100); //the max number


        /** Alter your loop to count backwards by 5's from 100 to -10: **/

//        int i = 100; //initial start
//        do {
//            System.out.println(i);
//            i -= 5; //decrement by 5's
//
//        } while (i >= -10); //the max number


        /** Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.*/

//        long i = 2; //had to use long because 1000000
//        do {
//            System.out.println(i);
//            i *= i; //squaring the i
//        } while (i <= 1000000);


        /** 1c. Refactor the previous two exercises to use a for loop instead */

//        for (long i = 2; i < 1000000; i *=i){
//            System.out.println(i);
//        }


        /** 2. Fizzbuzz **/


// Correct Answer refactored:

//        for (int i = 1; i<100; i++) {
//            //System.out.println(i);
//            if (i % 15 == 0) { //start with the highest value
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


        /** 3. Display a table of powers. */

//        Scanner sc = new Scanner(System.in);
//        boolean confirmation;
//        do {
//            System.out.print("Enter an integer: ");
//            int userNumber = sc.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= userNumber; i++) {
//                int userSquared = i*i; // need to use the iteration, not the user number!
//                int userCubed = i*i*i; // changed Math.pow to i* and changed double to int so it wouldn't show a decimal place on the table. Note: Math.pow needs a double byte
//                System.out.println(i + "      |" + userSquared + "      |" + userCubed);
//            }
//
//            System.out.print("Continue? [y/n]\n");
//            String userInput = sc.next();
//            confirmation = userInput.equalsIgnoreCase("y");
//
//        } while(confirmation);


        /** 4. Convert given number grades into letter grades.*/

//        Scanner sc = new Scanner(System.in);
//        boolean confirmation;
//        do {
//            System.out.print("Enter your grade: ");
//            int userGrade = sc.nextInt();
//            if(userGrade >= 88) {
//                System.out.println("You got an A!! :)");
//            } else if(userGrade >= 80 ) {
//                System.out.println("You got a B!");
//            } else if(userGrade >= 67 ) {
//                System.out.println("You got a C.");
//            } else if(userGrade >= 60 ) {
//                System.out.println("You got a D. :(");
//            } else if(userGrade >= 0 ) {
//                System.out.println("You got an F. :'(");
//            }
//
//            System.out.println("Would you link to continue?[y/n]");
//            String userInput = sc.next();
//            confirmation = userInput.equalsIgnoreCase("y");
//
//        } while (confirmation);



    }
}
