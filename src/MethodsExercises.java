import java.util.Scanner;
public class MethodsExercises {
    // 1.)
    public static void main(String[] arr) {
        System.out.println(Addition(1, 2));
        System.out.println(Subtraction(3, 2));
        System.out.println(Multiplication(3,2));
        System.out.println(Division(8,2));
        System.out.println(Modulus(9,3));
        System.out.println(getInteger(1,10));

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

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = getInteger(1, 10);
            int userNumber = Integer.parseInt(sc.next());

            if(userInput != userNumber){
                System.out.println("Please Enter a number again: ");
            }

        } while (userNumber);
    }

}