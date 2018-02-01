import java.util.ArrayList;

/**
 * Created by fannelbr on 1/24/2018.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private int idNumber;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, String email, int idNumber, ArrayList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.idNumber = idNumber;
        this.courses = courses;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getemail() {
        return this.email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList courses){
        this.courses = courses;
    }

    @Override
    public String toString() {
        String printThis = "";
        printThis = printThis + firstName + " " + lastName + "\n" +
                "\t" + "Student's email is " + email + "\n" +
                "\t" + "Student's ID number is " + idNumber + "\n"+
                "\t" + "Student's courses are " + courses;
        return printThis;
    }
}

