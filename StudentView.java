/**
 * Created by fannelbr on 1/24/2018.
 */
public class StudentView {

    private Student student;

    public StudentView(Student student){
        this.student = student;
    }

    public void printStudentDetails(Student student){
        this.student = student;
        printStudentDetails();
    }

    public void setStudentDetails(Student student){

    }

    public void printStudentDetails(){
        if(this.student == null) throw new IllegalArgumentException("Student");

        System.out.println("Student's first name is " + this.student.getFirstName());
        System.out.println("Student's last name is " + this.student.getLastName());
        System.out.println("Student's email is " + this.student.getemail());
        System.out.println("Student's id number is " + this.student.getIdNumber());
        System.out.println("Student's courses are " + this.student.getCourses());
        System.out.println("");
    }

    public void printCoursesDetails(){
        for (Course course: this.student.getCourses()){
            if (course == null) throw new IllegalArgumentException("Course");
            System.out.println("Course's name is " + course.getCourseName());
            System.out.println("Course's number is " + course.getCourseNumber());
            System.out.println("Course's credit is " + course.getCredit());
            System.out.println("Course's professor is " +course.getProfessor());
        }
    }
}
