package grades;
import util.Input;
import java.util.*;
import java.util.logging.SocketHandler;

public class GradesApplication {

    private static Input userInput = new Input();
    private static HashMap<String, Student> students;

//    Scanner sc = new Scanner(System.in);
//    boolean match;


    public static void main(String[] args) {
        System.out.println("Welcome!\nHere are the GitHub usernames of our students: ");
        students = getStudents();
    }

    protected static void showStudents(HashMap<String, Student> Students){
        for (String student : students.keySet()){
            System.out.println(" | " + student);
        }
    }

        protected static HashMap<String, Student> getStudents(){
            HashMap<String, Student> Students = new HashMap<>();

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

            Students.put("vpnoriega", Vanessa);
            Students.put("ThomsAlexander23", Thoms);
            Students.put("roland-valdez", Roland);
            Students.put("shanshan-su", Shanshan);

            return Students;

        }

}


