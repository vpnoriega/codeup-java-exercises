import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        //String[] person = new String [3];
        //System.out.println(Arrays.toString(person)); //not sure what this does?

        /** Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.*/

        Person person1 = new Person("Vanessa");
        Person person2 = new Person("Sergio");
        Person person3 = new Person("Iffy");

        String[] people = {person1.getName(), person2.getName(), person3.getName()};
        System.out.println(Arrays.toString(people)); //this prints the array of names

        for (String person : people) {
            System.out.println(person); //this prints the names on separate lines
        }

        /** Create a static method named addPerson.
         * Should accept an array of Person objects, as well as a single person object to add to the passed array
         * Should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array. */

//        public static void addPerson(String[] people, String person){
//
//
//        }







    }
}
