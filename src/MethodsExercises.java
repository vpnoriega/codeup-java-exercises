import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class MethodsExercises {

    /** 1. Basic Arithmetic **/

    public static void main(String[] arr) {
//        System.out.println(Addition(1, 2));
//        System.out.println(Subtraction(3, 2));
//        System.out.println(Multiplication(3, 2));
//        System.out.println(Division(8, 2));
//        System.out.println(Modulus(9, 3));
//        //getInteger(1,10);
        //getFactorial();
        diceRoll();


    }

//    public static int Addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int Subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int Multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int Division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int Modulus(int a, int b) {
//        return a % b;
//    }


    /** 2. Create a method that validates that user input is in a certain range */

    // VALIDATE that the users input is between 1 - 10
    // IF it's INVALID, prompt the user again
    // but if it's VALID? Exit the Loop

//    public static void getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        boolean wrongInput;
//
//        do {
//            System.out.printf("Enter a number between %d and %d", min, max);
//            int userNumber = Integer.parseInt(sc.next());
//
//            if(userNumber >= min && userNumber <= max){
//                wrongInput = false; //exits loop, because the user's input was valid
//            } else{
//                System.out.println("Please Enter a number again: ");
//                wrongInput = true; //loop again
//            }
//
//        } while (wrongInput);
//        System.out.println("Thank you for entering a number within the range!");
//
//    }

    /** 3. Calculate the factorial of a number. */

    //Prompt the user --> sout/scanner
    //Display the factorial of the userInput --> find a way to multiply
    //Ask if the user wants to continue --> confirmation (loop)
    //Use a loop to calculate the factorial --> why do we have to use a loop?
    //verify that the number is 1-10 --> why are we checking if the number is 1-10 AFTER calculating the factorial
    // use long to STORE to the factorial // need a variable to store it
    // CONTINUE if the user agrees //confirmation


//    public static void getFactorial() {
//        Scanner sc = new Scanner(System.in);
//        boolean confirmation;
//
//        do {
//            System.out.printf("Enter a number between 1-10");
//            int userNumber = sc.nextInt();
//            System.out.println(userNumber);
//
//            //??How do we get the user's number to display the factors of itself
//            // the first iteration @ 1
//            // create the string in the body
//            // the factorial solution
//
//            if(userNumber >= 1 && userNumber <= 10){
//                long fact = 1;
//                String emptyString = "";
//
//                for (int i = 1; i <= userNumber; i++) {
//                    if (i == 1) {
//                        //emptyString = emptyString + i;
//                        System.out.printf("%d! = %d = %d\n", i, i, i); // i 3x to fill in the format
//                    } else {
//                        fact = fact * i;
//                        //emptyString = emptyString + " x " + i;
//                        System.out.printf("%d! = %d = %d\n", i,i, fact);
//                    }
//                }
//            }
//
//            System.out.println("Would you link to continue?[y/n]");
//            String userInput = sc.next();
//            confirmation = userInput.equalsIgnoreCase("y");
//
//        }while(confirmation);
//    }


    //4. Create an application that simulates dice rolling:
    public static void diceRoll(){
        boolean confirmation;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of sides for a pair of dice: ");
        int diceSides = sc.nextInt();

        int diceOne = (int) (Math.random() * diceSides) + 1;
        System.out.println("Your first roll is a: " + diceOne);

        int diceTwo = (int) (Math.random() * diceSides) + 1;
        System.out.println("Your first roll is a: " + diceTwo);

        System.out.println("Would you link to continue?[y/n]");
            String userInput = sc.next();
            confirmation = userInput.equalsIgnoreCase("y");

            if(confirmation){
                diceRoll();
            }

    }



}
