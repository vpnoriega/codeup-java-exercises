package grades;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args){

        HashMap<String, String> Students = new HashMap<>();
        Student Vanessa = new Student("Vanessa");
        Vanessa.addGrade(85);
        Vanessa.addGrade(90);
        Vanessa.addGrade(88);

        Student Thoms = new Student("Thoms");
        Thoms.addGrade(93);
        Thoms.addGrade(95);
        Thoms.addGrade(91);

        Student Roland = new Student("Roland");
        Roland.addGrade(96);
        Roland.addGrade(93);
        Roland.addGrade(90);

        Student Shanshan = new Student("Shanshan");
        Shanshan.addGrade(100);
        Shanshan.addGrade(99);
        Shanshan.addGrade(98);

        Students.put("Vanessa", "vpnoriega");
        Students.put("Thoms", "ThomsAlexander23");
        Students.put("Roland", "roland-valdez");
        Students.put("Shanshan","shanshan-su");

        System.out.println(Students);


    }
}
