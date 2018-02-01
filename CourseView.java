/**
 * Created by fannelbr on 1/29/2018.
 */
public class CourseView {

    private Course course;

    public CourseView(Course course){
        this.course = course;
    }

    public void printCourseDetails(Course course){
        this.course = course;
        printStudentDetails();
    }

    public void setCourseDetails(Course course){

    }

    public void printStudentDetails(){
        if (this.course == null) throw new IllegalArgumentException("Course");

        System.out.println("This Course's name is " + this.course.getCourseName());
        System.out.println("This Course's number is " + this.course.getCourseNumber());
        System.out.println("This Course's number of credits is " + this.course.getCredit());
        System.out.println("This Course's professor is " + this.course.getProfessor());
    }
}
