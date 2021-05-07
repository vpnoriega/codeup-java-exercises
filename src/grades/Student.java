package grades;

import java.util.*;

public class Student {

        private String name;
        private ArrayList<Integer> grades = new ArrayList<>();

        //extra practice
//        private String className;
//        private ArrayList<Integer> classGrades = new ArrayList<>();

        public Student(String name) {
            this.name = name;
            this.grades = new ArrayList<>();
        }


    // returns the student's name
    public String getName(){
            return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
            this.grades.add(grade); //adding the additional grades to the array
    }

     //returns the average of the students grades
    public double getGradeAverage(){
            double total = 0;
            double totalGrades = this.grades.size(); //.size is similar to .length but for an array list

        for(double grade : this.grades){
            total += grade;
        }
        return total/totalGrades;

    }

    //public double


    public static void main(String[] args){

            Student Sergio = new Student("Sergio");
            System.out.println("Student's name is: " + Sergio.name);

// extra practice
//            Student Iffy = new Student("Iffy");
//        System.out.println("2nd Student's name is: " + Iffy.name);

        Sergio.addGrade(90);
        Sergio.addGrade(85);
        System.out.println("Student's grade is: " + Sergio.grades);

        System.out.println("Student's average is: " + Sergio.getGradeAverage());


    }

    }

