/**
 * Created by fannelbr on 1/29/2018.
 */
public class ProfessorView {

    private Professor professor;

    public ProfessorView(Professor professor) {
        this.professor = professor;
    }

    public void printProfessorDetails(Professor professor) {
        this.professor = professor;
        printProfessorDetails();
    }

    public void setProfessorDetails(Professor professor) {

    }

    public void printProfessorDetails() {
        if (this.professor == null) throw new IllegalArgumentException("Professor");

        System.out.println("Professor's first name is " + this.professor.getFirstName());
        System.out.println("Professor's last name is " + this.professor.getLastName());
        System.out.println("Professor's email is " + this.professor.getEmail());
        System.out.println("Professor's phone number is " + this.professor.getPhoneNumber());
        System.out.println("");
    }
}
