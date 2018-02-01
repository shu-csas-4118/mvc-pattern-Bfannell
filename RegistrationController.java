/**
 * Created by fannelbr on 1/31/2018.
 */
public class RegistrationController {
    private RegistrationView registrationView;
    private Student student;

    public RegistrationController(RegistrationController registrationController){
        this.registrationView = registrationView;
        this.student = student;
    }

    public void printCoursesDetails(){
        this.registrationView.printCoursesDetails(this.student);
    }
}
