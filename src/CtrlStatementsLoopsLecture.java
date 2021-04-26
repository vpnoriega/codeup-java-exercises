import java.util.Scanner;

public class CtrlStatementsLoopsLecture {
    public static void main(String[] args){
        //Boolean Expressions
        //An expression that evaluated to a boolean value(5 == 5 //t, 5<6 //t, 5>6, //f)
        //These relational operators will have similarities to our JS work - however: no truth-y, or false -y (no === vs ==, <== vs <=, etc.)

//        System.out.println("(5 == 5) = " + (5 ==5));
//        System.out.println("(5<6) = " + (5<6));
//        System.out.println("(5>6) = " + (5>6));

//        System.out.println("('y' == 'Y') = " + ('y' == 'Y'));
//        System.out.println("('y' == 'y') = " + ('y' == 'y'));

        //        boolean isAdmin = true;
//        System.out.println("(isAdmin == false) = " + (isAdmin == true));

        //Logical Operators
        //Combine multiple boolean expressions for  evaluation - isAdmin & isLoggedIn, shoppingCart.length > 5 || isDiscountMember,
//        boolean isAdmin = true;
//        boolean isLoggedIn = true;
//        boolean isOwner = false;
//        System.out.println("(isAdmin && isLoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden administrator portal?" + (isAdmin && isLoggedIn));
//
//        String str1 = "Kenneth";
//        String str2 = "Kenneth";
//
//        System.out.println("(str1 == str2) = " + (str1 == str2)); //don't do this
//
//        System.out.println("str1.equals(str2) = " + str1.equals(str2)); //do this instead

        // CONTROL STRUCTURES: Rely on your foundation in JS
        //for this exercise change the boolean value to see what the output is:

//        boolean isAdmin = false;
//        boolean isLoggedIn = true;
//        boolean isOwner = true;
//
//        if(isAdmin && isLoggedIn){
//            System.out.println("Admin portal accessed");
//        }
//
//        if(isOwner || isAdmin){
//            System.out.println("Show the edit button for this post");
//        }
//
//        if(isLoggedIn){
//            System.out.println("Welcome to our website!");
//        }


        // IF ... ELSE/IF

//        boolean isAdmin = false;
//        boolean isLoggedIn = false;
//        boolean isOwner = true;

//        if(isLoggedIn && isAdmin){
//            System.out.println("Show the 'admin' button on the home page and all recent posts by all users");
//        }else if(isLoggedIn && isOwner){
//            System.out.println("Show the 'my account' button with this user's most recent posts");
//        } else if(isLoggedIn){
//            System.out.println("Show a 'create post' button as well as examples of posts by other users");
//        } else if(!isLoggedIn){
//            System.out.println("Show the login/registration page to begin use of the application");
//        }


        //SWITCH/CASE Statement:

        int diceRoll = (int) (Math.random() * 6 - 1 + 1) + 1;
        System.out.println("dice roll = " + diceRoll);

        switch (diceRoll){
            case 1:
                System.out.println("Rolled a one!");
                break;
            case 2:
                System.out.println("Rolled a two!");
                break;
            case 3:
                System.out.println("Rolled a three!");
                break;
            case 4:
                System.out.println("Rolled a four!");
                break;
            case 5:
                System.out.println("Rolled a five!");
                break;
            case 6:
                System.out.println("Rolled a six!");
                break; //don't need it here, but just setting up for the next thing
        }

        //While
        // THIS WILL CREATE AN INFINITE LOOP
//        int i = 0;
//        while (i<=10){
//            System.out.println("i is " + i);
//            i++;
//        }

        //Do-While
//        boolean newsLetterSignUp;
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Are you ready to sign up for our Newsletter? Note: Only 'yes' will work.\n");
//        String userInput = scanner.nextLine();
//        if (userInput.equalsIgnoreCase("yes")){
//            System.out.println("We are so happy to hear you are interested in our newsletter! Thank you for signing up!");
//        }
//        }

        //FOR LOOP:

        String [] fruits = {"apples", "bananas", "jackfruit"};
        for(int i = 0; i<fruits.length; i++){
            System.out.println("Here's a fruit: "+ fruits[i]);
        }

        //Break && Continue

        //Continue:
        //Goal: skipping odd numbers, print even numbers

        for (int i = 1; i <=10; i ++){
            if(i%2==1){
                System.out.println("Odd number - skip it!");
                continue;
            }
            System.out.println("Here's a nice even number " + i);
        }



    }
}
