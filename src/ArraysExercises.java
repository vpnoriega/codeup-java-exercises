import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        //String[] person = new String [3];
        //System.out.println(Arrays.toString(person)); //not sure what this does?


        /** Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.*/


        Person[] people = new Person[3]; //declaring the variable called people of TYPE array person
        people[0] = new Person("Vanessa");
        people[1] = new Person("Sergio");
        people[2] = new Person("Iffy");

//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i].getName()); //getName is a public instance (static not used) Method on the person class
//        }

//        String[] peopleNames = {people[0].getName(), people[1].getName(), people[2].getName()};
//        System.out.println(Arrays.toString(peopleNames)); //this prints the array of names


        for (Person person : people) { //var declaration of type : array
            System.out.println(person.getName()); //this prints the names on separate lines
        }


        Person Larry = new Person("Larry"); //it's equal to new instance of person
        Person[] allPeople = addPerson(people,Larry); //invoking the person method into the MAIN method

        for (Person person : allPeople) { //var declaration of type : array
            System.out.println(person.getName()); //this prints the names on separate lines
        }
    }

        /** Create a static method named addPerson.
         * Should accept an array of Person objects, as well as a single person object to add to the passed array
         * Should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array. */

//new scope:
        //making a new array by passing the parameter

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPersons = Arrays.copyOf(people, people.length + 1); //based on what is in the parameter in line 44, adds an empty spot to the empty array
        newPersons[newPersons.length-1] = person; //adding the new person to the last spot
        return newPersons; //returning the array, not just the person

    }


}

