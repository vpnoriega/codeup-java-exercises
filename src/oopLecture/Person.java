package oopLecture;
import java.util.Scanner;

public class Person {
    protected String firstName;
    private String lastName;

    public String sayHello() {
        return "Hello, " + this.firstName + " " + this.lastName + ".";
    }

    public String joinsChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static long worldPop = 7_860_000_000L;

    public static void main(String[] args){
  //      Person ken = new Person();
//        Person vanessa = new Person();
//        Person douglas = new Person();
//
//        Scanner scanner = new Scanner(System.in);
//
//        String myName = "Ken";
//        ken.firstName = myName;
//        ken.lastName = "Howell";
//
//        vanessa.firstName = "Vanessa";
//        vanessa.lastName = "Noriega";
//
//        douglas.firstName = "Douglas";
//        douglas.lastName = "Hirsh";
//
////        System.out.println("ken.firstName = " + ken.firstName);
////        System.out.println("ken.lastName = " + ken.lastName);
////        System.out.println("ken.joinsChat() = " + ken.joinsChat());
//
//        //World population + class/object fields
//        System.out.println("worldPop = " + Person.worldPop);
//        Person.worldPop += 1; //a new PERSON was created, we need to adjust our worldPop!!!
//        System.out.println("worldPop = " + Person.worldPop);
//
//        //Hey, we can do this (instanceObject.classField, but ehhh, let's try not to
//        System.out.println("douglas.worldPop = " + douglas.worldPop);
//
////        System.out.println("Person.firstName = " + Person.firstName); //This will not compile - instant error and the java program will not continue until refactored.
    }

}
