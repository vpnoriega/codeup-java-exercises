package util;
import util.Input;

public class InputTest {
    public static void main(String [] args){

        Input scanner = new Input();

//        System.out.println("scanner.getInt() = " + scanner.getInt());
//
//        System.out.println("scanner.yesNo() = " + scanner.yesNo());

       //System.out.println("scanner.getInt(min, max) = " + scanner.getInt(1,10));

        //System.out.println("scanner.getDouble() = " + scanner.getDouble());

        System.out.println("scanner.getInt(min, max) = " + scanner.getDouble(1,10));

    }
}
