/**
 * Created by fannelbr on 1/31/2018.
 */
import java.util.ArrayList;

public class RegistrationView {
    private Student student;
    private ArrayList<Course> courses;

    public RegistrationView(){

    }
    public void RegisterCourses(Student student, ArrayList<Course> courses){
        this.student = student;
        this.courses = courses;
    }

    public void printCoursesDetails(Student student){
        this.student = student;
        printCoursesDetails();
    }

    public void printCoursesDetails(){
        for (Course courses: this.courses){
            if (this.courses == null) throw new IllegalArgumentException("Courses");
            System.out.println("Course name is " + courses.getCourseName());
            System.out.println("Course number is " + courses.getCourseNumber());
            System.out.println("Course credit is"  + courses.getCredit());
            System.out.println("Course professor is " + courses.getProfessor());
        }
        }


}
