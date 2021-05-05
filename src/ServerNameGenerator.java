public class ServerNameGenerator {

    public static void main(String[] args){

        /** Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns: */

        String [] adjectives = {"pretty", "ugly", "tall","short","thin","thick","happy","sad","excited", "relaxed"};

        String [] nouns = {"library", "school", "laptop","monitor","notebook","pencil","keyboard", "mouse", "headphones", "Codey the duck"};

        System.out.println("Here is your server name: ");
        System.out.println(randomElement(nouns) + "-" + randomElement(adjectives)); //enter server name by passing in nouns and adjs into the randomElement Method, inside of the MAIN method

    }

    /** Create a method that will return a random element from an array of strings: */


    public static String randomElement(String[] name){
        return name[(int) Math.random() * (name.length-1)];
    }
}
