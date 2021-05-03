import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        int dealersNum = (int) (Math.random() * 10 - 1 + 1) + 1;
        int playersGuess;
        boolean wrongInput;
        int i = 3;
        Scanner sc = new Scanner(System.in);


        do {
            //first checks the number of tries (vocab correction at 1 iteration):
            if (i == 1) {
                System.out.println("You have " + i + " try to guess the dealer's number: ");
            } else {
                System.out.println("You have " + i + " tries to guess the dealer's number: ");
            }

            playersGuess = sc.nextInt(); //prints players number


            //had to put first in order to check the amount of tries left (going from 3 to 1):
            if (i == 1) {
                System.out.println("You lost! The dealers number is: " + dealersNum + ". Better luck next time!");
                wrongInput = false;

            } else if (playersGuess < dealersNum) {
                System.out.println("Go Higher!");
                wrongInput = true; //loops again
                i--;

            } else if (playersGuess > dealersNum) {
                System.out.println("Go Lower!");
                wrongInput = true; //loops again
                i--;

            }  else {
                System.out.println("You got it! " + dealersNum + " Good game :) ");
                wrongInput = false; //exits loop
            }


        } while (wrongInput);
    }
}