public class MethodLecture {
    public static void main(String[] args){
        System.out.println("Hello Methods");
        // --- Defining and Calling with Various Inputs
        sayGreeting(); //called from the method below
        sayInput("Hello from this input");
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
}
