public class HelloWorld {
    public static void main(String[] args) {
        // System.out.print("Hello, ");
    // System.out.print("World!");

int myFavoriteNumber = 7;
System.out.println(myFavoriteNumber);

String myString = "Java is cool";
System.out.println(myString);
//if you put it in single quotes (character value) or a number, it will create an error because it assigned to a string

//long myNumber = 123;
//System.out.println(myNumber);
//if you run an empty variable or the wrong data type, it will create an illegal expression error

// Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does? What does L actually do if 12300000 is technically in the number range

//float myNumber = 3.14F;
//

//or

 float myNumber = (float) 3.14;
 System.out.println(myNumber);

//with: float myNumber = 3.14, you can add F at the end to fix the error or myNumber = (float) 3.14;
 // ?? Why do we have to assign float to it twice (ref. L24)

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x); //add 1 to x first, then gave it a value

        // int class = 0;

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; //can't run because you're declaring it as an object when it's already assigned to a string

//        int three = (int) "three"; // can't run because it's a string


// Shorthand expression

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.print(y);

        int x = 10;
        int y = 2;
       // x /= y;
        y -= x;
        //System.out.println(x);
        System.out.println(y);

int z = Integer.MAX_VALUE;
z+=1;
System.out.println("z = " + z);



    }
}