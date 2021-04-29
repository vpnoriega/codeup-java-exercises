import java.util.Scanner;

public class Bob {
    public static void main(String [] args ){
        String userInput;
        Scanner sc = new Scanner(System.in);
        boolean match;

        System.out.println("Talk to Bob! (To stop the conversation, type: quit)");

        do {
            match = false;
            System.out.println(">");
            userInput = sc.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
                match = true;
            }
            else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
                match = true;
            }
            else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
                match = true;
            }
            else {
                System.out.println("Whatever");
            }
        }while (!userInput.equalsIgnoreCase("quit"));


    }
}
