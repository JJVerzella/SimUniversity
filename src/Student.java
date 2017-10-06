
/**
 * File name: Student.java
 * IST 311: Object-Oriented Design and Software Applications
 * @author JJ Verzella
 * @version 1.01 2017-09-08
 */
public class Student extends Person implements Changeable {

    // Instance and Class Variables
    public static final String FRESHMEN = "FRESHMEN";
    public static final String SOPHOMORE = "SOPHOMORE";
    public static final String JUNIOR = "JUNIOR";
    public static final String SENIOR = "SENIOR";
    public String classStatus;

    // Default Method
    public Student() {
    }

    // Overloaded Constructor
    public Student(String first, String last, String phone, String email, String class_year) {
        super(first, last, phone, email);
        switch (class_year.toUpperCase()) {
            case FRESHMEN:
                this.classStatus = FRESHMEN;
                break;
            case SOPHOMORE:
                this.classStatus = SOPHOMORE;
                break;
            case JUNIOR:
                this.classStatus = JUNIOR;
                break;
            case SENIOR:
                this.classStatus = SENIOR;
                break;
            default:
                break;
        }
    }

    // Getter Method
    public String getClassStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + getFirstName() + " " + getLastName() + " (Class Status: " + getClassStatus() + ")";
    }

    // Implemented method changeName() from the 'Changeable' Interface
    @Override
    public void changeName(String first, String last) {
        setFirstName(first);
        setLastName(last);
    }
}
