package util;

import java.util.Scanner;

public class Input {
    private class scanner{
        Scanner sc = new Scanner(System.in);

        public String getString(){
            return this.sc.nextLine();
        }

        public boolean yesNo() {
            String input = sc.nextLine();
            return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

        public int getInt(int min, int max){
            System.out.println("Enter a number between " + min + " and " + max + ".");
            int num = sc.nextInt();

            if (num >= min && num <= max){
                return num;
            }
            else {
                System.out.println("Your number is invalid.");
                return getInt(min, max);
            }
        }

        public double getDouble(double min, double max){
            System.out.println("Enter a decimal number between " + min + " and " + max + ".");
            double num = sc.nextInt();

            if (num >= min && num <= max){
                return num;
            }
            else {
                System.out.println("Your number is invalid.");
                return getDouble(min, max);
            }
        }


}
