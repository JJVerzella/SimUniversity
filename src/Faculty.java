
/**
 * File name: Faculty.java
 * IST 311: Object-Oriented Design and Software Applications
 * @author JJ Verzella
 * @version 1.01 2017-09-08
 */
public class Faculty extends Employee implements Changeable {

    // Instance and Class Variables
    public static final String ASSISTANT_PROFESSOR = "ASSISTANT PROFESSOR";
    public static final String ASSOCIATE_PROFESSOR = "ASSOCIATE PROFESSOR";
    public static final String PROFESSOR = "PROFESSOR";
    public String facultyRank;

    // Default Constructor
    public Faculty() {
    }

    // Overloaded Constructor
    public Faculty(String first, String last, String phone, String email, String office, String officePhone, String dateOfEmployment, String facultyRank) {
        super(first, last, phone, email, office, officePhone, dateOfEmployment);
        switch (facultyRank.toUpperCase()) {
            case ASSISTANT_PROFESSOR:
                this.facultyRank = ASSISTANT_PROFESSOR;
                break;
            case ASSOCIATE_PROFESSOR:
                this.facultyRank = ASSOCIATE_PROFESSOR;
                break;
            case PROFESSOR:
                this.facultyRank = PROFESSOR;
                break;
            default:
                break;
        }
    }

    // Setter Method
    public void setFacultyRank(String rank) {
        facultyRank = rank;
    }

    // Getter Method
    public String getFacultyRank() {
        return facultyRank;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + getFirstName() + " " + getLastName() + " (Rank: " + getFacultyRank() + ")";
    }

    // Implemented method changeName() from the 'Changeable' Interface
    @Override
    public void changeName(String first, String last) {
        setFirstName(first);
        setLastName(last);
    }
}
