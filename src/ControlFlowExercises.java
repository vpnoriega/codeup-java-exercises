public class ControlFlowExercises {
    public static void main(String[] args){
//      int i = 5;
//      while (i<=15){
//          System.out.println("i is " + i);
//            i++;
//      }


        /** Count by 2's starting 0 to 100: **/
//        int i=0;
//do {
//    System.out.println(i);
//    i+=2;
//
//        } while(i<=100); //the max number


        /** Count by 5's backwards from 100 to -10 **/

//        int i=100;
//do {
//    System.out.println(i);
//    i-=5;
//
//        } while(i >= -10); //the max number

        /** Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.*/

//        long i = 2;
//        do {
//    System.out.println(i);
//    i*=i;
//        } while (i<=1000000);

        /** Refactor the previous two exercises to use a for loop instead */
        for (long i = 2; i < 1000000; i *=i){
            System.out.println(i);
        }




    }
}
