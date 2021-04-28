import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class MethodsExercises {
    // 1.)
    public static void main(String[] arr) {
        System.out.println(Addition(1, 2));
        System.out.println(Subtraction(3, 2));
        System.out.println(Multiplication(3,2));
        System.out.println(Division(8,2));
        System.out.println(Modulus(9,3));
        //getInteger(1,10);


    }

    public static int Addition(int num1, int num2) {
        return num1 + num2;

    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;

    }

    public static int Multiplication(int num1, int num2) {
        return  num1 * num2;
    }

    public static int Division(int num1, int num2) {
        return num1/num2;

    }

    public static int Modulus(int a, int b){
        return a % b;
    }


    //2.
    // VALIDATE that the users input is between 1 - 10
    // IF it's INVALID, prompt the user again
    // but if it's VALID? What do we do, Exit the Loop?

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

    //3. Calculate the factorial of a number.

    //Prompt the user // sout/scanner
    //Display the factorial of the userInput //find a way to divide
    //Ask if the user wants to continue // confirmation (loop)
    //Use a loop to calculate the factorial //why do we have to use a loop?
    //verify that the number is 1-10 // why are we checking if the number is 1-10 AFTER calculating the factorial

    // use long to STORE to the factorial // need a variable to store it
    // CONTINUE if the user agrees //confirmation

    // Factorials are denoted by the !


//    public static long getFactorial(int num) {
//        Scanner sc = new Scanner(System.in);
//        //boolean wrongInput;
//        boolean confirmation;
//
//
//        do {
//            System.out.printf("Enter a number between 1-10");
//            int userNumber = Integer.parseInt(sc.next());
//            System.out.println(userNumber);
//
//            System.out.println("Would you link to continue?[y/n]");
//            String userInput = sc.next();
//
//            //??How do we get the user's number to display the factors of itself
//
//            if(confirmation = userInput.equalsIgnoreCase("y"));
//
//            {
//                long fact = 1;
//                for (int i = 2; i <= num; i++) {
//                    fact = fact * i;
//                }
//                return fact;
//            }
//
////            if(userNumber >= min && userNumber <= max){
////                wrongInput = false; //exits loop, because the user's input was valid
////            } else{
////                System.out.println("Please Enter a number again: ");
////                wrongInput = true; //loop again
////            }
//
//
//
//        }while((confirmation));
//    }

    //4. Create an application that simulates dice rolling:
public static void diceRoll() {
    int diceOne = (int) (Math.random() * 6 - 1 + 1) + 1;
    int diceTwo = (int) (Math.random() * 6 - 1 + 1) + 1;
    System.out.println("Enter the number of Sides for a pair of dice: ");
}





}