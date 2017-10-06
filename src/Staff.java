
/**
 * File name: Staff.java
 * IST 311: Object-Oriented Design and Software Applications
 * @author JJ Verzella
 * @version 1.01 2017-09-08
 */
public class Staff extends Employee {

    // Instance Variable
    private String staffTitle;

    // Default Constructor
    public Staff() {
    }

    // Overloaded Constructor
    public Staff(String first, String last, String phone, String email, String office, String officePhone, String dateOfEmployment, String staffTitle) {
        super(first, last, phone, email, office, officePhone, dateOfEmployment);
        this.staffTitle = staffTitle;
    }

    // Setter Method
    public void setStaffTitle(String staffTitle) {
        this.staffTitle = staffTitle;
    }

    // Getter Method
    public String getStaffTitle() {
        return staffTitle;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + getFirstName() + " " + getLastName() + " (Title: " + getStaffTitle() + ")";
    }
}
