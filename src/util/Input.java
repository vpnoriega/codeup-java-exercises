package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in); //every time an input is made, it will be assigned a new scanner to use
    }

        public String getString() {
            return this.sc.nextLine();
        }

        public boolean yesNo() {
            String input = sc.nextLine();
            return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
        }

        public int getInt(int min, int max) {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            int num = sc.nextInt();

            if (num >= min && num <= max) {
                return num;
            } else {
                System.out.println("Your number is invalid.");
                return getInt(min, max);
            }
        }

        public int getInt(){
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();
            return num;
        }

        public double getDouble(double min, double max) {
            System.out.println("Enter a decimal number between " + min + " and " + max + ".");
            double num = sc.nextInt();

            if (num >= min && num <= max) {
                return num;
            } else {
                System.out.println("Your number is invalid.");
                return getDouble(min, max);
            }
        }

        public double getDouble(){
            System.out.println("Enter a decimal number: ");
            double doubleNum = sc.nextInt();
            return doubleNum;
        }


    }

