public class MethodLecture {
    public static void main(String[] args){
        System.out.println("Hello Methods");
        // --- Defining and Calling with Various Inputs
        sayGreeting(); //called from the method below
        sayInput("Hello from this input");
        System.out.println(getGreetingWithName("Marco"));
        System.out.println(returnProductOfThreeNumbers(1,2,3));
        System.out.println(getGreetingWithName("Goodbye ","Douglas"));
        //countToLoop(100);
        countTo100(1);
    }

    //no inputs and no outputs
    public static void sayGreeting(){
        System.out.println(getDefaultGreeting()); //calling the method below
    }

    //no returned output with input
    public static void sayInput(String input){ //you must provide the parameters if you list it in the method
        System.out.println(input);
    }

    //return output without an input
    public static String getDefaultGreeting(){
        return "Hello, ";
    }

    //return output with input
    public static String getGreetingWithName(String name){
        return getDefaultGreeting() + " " + name; //concatenating two methods
    }

    //return output with input using numbers
    public static double returnProductOfThreeNumbers(double num1, double num2, double num3){
        double result = num1 * num2 * num3; //you don't need to store it in a var
        return result;
    }

    //Method Overloading

    public static String getGreetingWithName(String salutation, String name){
        return salutation + name;
    } //you can have multiple methods with the same name as long as the params are different

    //Method Recursion - creating a method that calls itself, but with different parameters than were originally passed

    public static void countToLoop(int num){
        for (int i = 0; i<= num; i++){
            System.out.println(i);
        }
    }

    public static int countTo100(int num){
        System.out.println(num);
        if(num == 100){
            return num;
        }else {
            return countTo100(++num);
        }
    }


}
