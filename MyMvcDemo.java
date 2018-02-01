import java.util.ArrayList;

/**
 * Created by fannelbr on 1/24/2018.
 */
import java.util.ArrayList;
public class MyMvcDemo {

    public static void main(String[] args){

        ArrayList<Course> courses = new ArrayList<Course>();



        Professor professor = new Professor("Garret", "Changg", "changgar@shu.edu", 1234546);
        ProfessorView professorView = new ProfessorView(professor);
        ProfessorController professorController = new ProfessorController(professor, professorView);

        Course Art = new Course("Art", 101, 3, "Marlowe");
        Course Acting = new Course ("Acting", 1001, 3, "Doe");

        courses.add(Art);
        courses.add(Acting);

        Student student = new Student("Britton", "Fannell", "bfannell@gmail.com", 11110162, courses);
        StudentView studentView = new StudentView(student);
        StudentController studentcontroller = new StudentController(student, studentView);

        RegistrationView registrationView = new RegistrationView();
        //RegistrationController registrationController = new RegistrationController(registrationView, student);

        studentcontroller.printStudentDetails();
        professorController.printProfessorDetails();
        //registrationController.printRegistrationDetails();
    }
}
