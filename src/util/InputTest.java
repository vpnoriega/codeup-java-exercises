package util;
import util.Input;

public class InputTest {
    public static void main(String [] args){

        Input scanner = new Input();
        System.out.println("scanner.getInt() = " + scanner.getInt());

        System.out.println("scanner.yesNo() = " +
                scanner.yesNo());


    }
}
