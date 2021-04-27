import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class MethodsExercises {
    // 1.)
    public static void main(String[] arr) {
        System.out.println(Addition(1, 2));
        System.out.println(Subtraction(3, 2));
        System.out.println(Multiplication(3,2));
        System.out.println(Division(8,2));
        System.out.println(Modulus(9,3));
        getInteger(1,10);


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

    public static void getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        boolean wrongInput;

        do {
            System.out.printf("Enter a number between %d and %d", min, max);
            int userNumber = Integer.parseInt(sc.next());

            if(userNumber >= min && userNumber <= max){
                wrongInput = false; //exits loop
            } else{
                System.out.println("Please Enter a number again: ");
                wrongInput = true; //loop again
            }

        } while (wrongInput);
        System.out.println("Thank you for entering a number within the range!");

    }

    //3.


}