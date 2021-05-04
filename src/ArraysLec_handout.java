import java.util.Arrays;
import java.util.Scanner;

public class ArraysLec_handout {

    public static void main(String[] args) {

        //~*~ Welcome to Java Arrays[] ~*~
        //Key differences coming from JS: a. arrays have a fixed length that we **must** set, b. arrays have a set data type [with all elements matching].
        //** Structure **
        //double[] prices;

        //datatype[] varName (gets us going, but we'd still need to take another step to give the array a length):
        //prices = new double[4];

        //TODO Together: Let's set up our first array - an array of prices with a double datatype.
        double[] prices = new double[4];
        System.out.println("prices[0] = " + prices[0]);
        System.out.println("prices[1] = " + prices[1]);

        //TODO Together: Nice! So, we can set up an array with a literal (prices = new double[4], diceSides = new int[6], groceryList = new String[10]), but that's not all. We can also use a constant or variable!

        final int diceSides = 6;
        int[] sidesArray = new int[diceSides];

        System.out.println("sidesArray[6] = " + sidesArray[5]);

        int numGroceries = 10;
        String[] groceryList = new String[numGroceries];
        System.out.println("groceryList[5] = " + groceryList[5]);


        //~*~ Array Elements ~*~

        //Similarities from JS: Array elements are referred to by their Array[index] beginning with 0.
        //Elements also come with default values = 0/0.0, false, \0, or null depending on the type.

        //TODO Together: Let's see some of these defaults in action from our prior examples.

        System.out.println();
        System.out.println("prices[0] = " + prices[0]); //default 0
        System.out.println("sidesArray[0] = " + sidesArray[0]); //default 0
        System.out.println("groceryList[0] = " + groceryList[0]); //null [strings are what in java?]

        //TODO Together: What if we try to refer to an index beyond what we have set up?
        //System.out.println("sidesArray[6] = " + sidesArray[6]); //error, out of bounds!

        //TODO Together: We can use the ARRAY INITIALIZER to set up not only our array and its length, but the elements inside as well!

        String[] cohorts = {"Marco", "Oberon", "Neptune", "Polaris"};
        System.out.println("Hey, good to see you today " + cohorts[0] + " students! Did you know our upcoming cohort is going to be named " + cohorts[3] + "?");

        //TODO: Build your first Java array! Feel free to use the array initializer or otherwise, but take time to make an array of your choosing and then test it out with a System.out.print of some kind to check an element within to satisfaction.
        //TODO Example: String[] myPets = new String[2]; myPets[0] = "Fluffy"; myPets[1] = "Spot"; OR: String[] myPets = {"Fluffy", "Spot"}. System.out.print(myPets[0]) // Fluffy

//        String[] favoriteFoods = new String[3];
//                favoriteFoods[0] = "Sushi";
//                favoriteFoods[1] ="Tacos";
//                favoriteFoods[2]= "Wings";

                String[] favoriteFoods ={"Sushi","Tacos","Wings"};

        //~*~ Iterating Arrays ~*~
        //for + .length:

        //TODO Together: A for loop [for(init;cond;count){}] can perform similar iteration tasks as we had used it for in JS.

        System.out.println();
        for(int i = 0; i < cohorts.length; i++){
            System.out.println("Codeup has a number of cohorts! One of them is the " + cohorts[i] + " cohort.");
        }

        //enhanced for (loop : loops){}
        //TODO Together: Java also provides an enhanced for [for (ele : arr) {}] to use!

        System.out.println();
        for(String cohort : cohorts){ //for(dataType singular : arrName){ do some stuff }
            System.out.println("Codeup runs a few cohorts at a time - one of the ones from 2021 is " + cohort);
        }
        //TODO: Using the array you set up above, practice iterating through the array using both of our types of for loops. When might you choose to use one over the other?

        System.out.println("Here is one my favorite foods: " + favoriteFoods[1]);

        //~*~ Java array.methods() ~*~
        //We have access to a variety of pre-built static methods in the java.util.Arrays class

        //void Arrays.fill(arrayName, value) = let's fill all elements in the array provided with the given value.

        //TODO Together: An empty groceryList isn't going to work - let's at least get something in there. Everyone loves ice cream, right?

        Arrays.fill(groceryList, "ice cream");

//        for(String grocery : groceryList){
//            System.out.println(grocery);
//        }

        //array Arrays.copyOf(myArray, arrLength) = let's make a clean copy of myArray up to arrLength element
        //TODO Together: Well, that was certainly a lot of ice cream. I think we overdid it though - maybe three pints of ice cream would suffice for a weekend ice cream party.
//        groceryList[0] = "bananas";
//        groceryList[1] = "apples";
        String[] newList = Arrays.copyOf(groceryList, 3);

        for(String element : newList){
            System.out.println(element);
        }

        //Arrays.equals(arr1, arr2) = T/F: are both arrays the same type and all the elements equal?
        //TODO Together: Let's demonstrate .equals() by comparing our ice cream party lists:

        System.out.println("Arrays.equals(groceryList, newList) = " + Arrays.equals(groceryList, newList));

        System.out.println("Arrays.equals(groceryList, groceryList) = " + Arrays.equals(groceryList, groceryList));


        //~*~ More Array.methods() ~*~


        //Arrays.toString(arr) = returns a String representation of the array including the brackets

        //TODO Together: We have an array of Cohorts in this file - let's stringify that array.

        System.out.println();
        System.out.println(Arrays.toString(cohorts));

        //TODO Together: We do get the brackets back with the method, but let's solve that with a little method chain-chain-chain as an example of what you could do:

        String cohortNameString = Arrays.toString(cohorts).replace("[", "").replace("]", "");

        System.out.println(cohortNameString + " cohorts are reporting for duty!");


        //Arrays.sort(arr) - Sort elements of array into ascending order
        //TODO Together: Hey, Oberon and Neptune are out of line in our array - .sort might help us out there!

        System.out.println();
        Arrays.sort(cohorts);

        cohortNameString = Arrays.toString(cohorts).replace("[", "").replace("]", "");

        System.out.println(cohortNameString + " cohorts are reporting for duty!");


        //Arrays.binarySearch(array, value) = returns int index of value when found, negative number when not found

        //TODO Together: Let's demonstrate binarySearch by looking for a couple cohorts in our array.

        System.out.println("Arrays.binarySearch(cohorts, \"Marco\") = " + Arrays.binarySearch(cohorts, "Marco"));
        System.out.println("Arrays.binarySearch(cohorts, \"Polaris\") = " + Arrays.binarySearch(cohorts, "Polaris"));
        System.out.println("Arrays.binarySearch(cohorts, \"Deimos\") = " + Arrays.binarySearch(cohorts, "Deimos"));

        //TODO: We've covered a lot of different methods so far - pick at least two(2) to experiment with below with either an array from the lecture, your earlier array you built, or a brand new array for this TODO.

        //~*~ 2d Arrays (enter the matrix) ~*~

        //2d Arrays (commonly referred to as an array matrix) are daunting to encounter for the first time. . but, imagine you are working with a grid/spreadsheet

        //TODO Together: Let's utilize the example from the slide to dive into this concept:

        int[][] matrix = {
                {1, 2, 3}, //row 1
                {4, 5, 6}, //row 2
                {7, 8, 9}  //row 3
        };

        for (int[] row : matrix){ //an individual int array from our array of arrays
            System.out.println("+---+---+---+");
            System.out.print("| "); //outer loop
//
            for (int number : row){ //an individual number from our int array
                System.out.print(number + " | ");
            }

            System.out.println();
        }
        System.out.println("+---+---+---+");

        System.out.println("matrix[0][0] = " + matrix[0][0]); //row 1, col 1
//
//        //TODO Interactive: Help me out here, if matrix[0][0] worked as demonstrated above, can you help me print out the "5" and "9"?

//        System.out.println("matrix[1][1] = " + matrix[1][1]);
//        System.out.println("matrix[2][2] = " + matrix[2][2]);

//        //TODO: Emergency! Emergency! Alien invaders have been detected at int 6, int 7, and int 2 in our grid area! Dispatch our MIB forces to the appropriate parts of the array by finishing my System.outs!

        System.out.println();
        System.out.println("ALERT ** ALERT ** ALERT **");
        System.out.println("|| ALIEN ACTIVITY DETECTED IN OUR GRID ||");
        System.out.println("** ALERT ** ALERT ** ALERT");
        System.out.println("Deploying MIB personnel to counter alien activity!");

         System.out.println("MIB Officer Douglas H. headed to grid area " + matrix[1][2] + "!"); //should say "grid area 6!"

         System.out.println("MIB Officer Larry C. headed to grid area " + matrix[2][0] + "!"); //should say "grid area 7!"

         System.out.println("MIB Officer Kenneth H. headed to grid area " + matrix[0][1] + "!"); //should say "grid area 2!"

    }

}