import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        int dealersNum = (int) (Math.random() * 10 - 1 + 1) + 1;
        int playersGuess;
        boolean wrongInput;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Guess the dealer's number: ");
            playersGuess = sc.nextInt();

            if (playersGuess < dealersNum){
                System.out.println("Go Higher!");
                wrongInput = true; //loops again

            } else if(playersGuess > dealersNum){
                System.out.println("Go Lower!");
                wrongInput = true; //loops again

            } else{
                System.out.println("You got it! Good game :) ");
                wrongInput = false; //exits loop
            }

        } while (wrongInput);
    }
}