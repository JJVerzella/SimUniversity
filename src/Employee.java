
/**
 * File name: Employee.java
 * IST 311: Object-Oriented Design and Software Applications
 * @author JJ Verzella
 * @version 1.01 2017-09-08
 */
public class Employee extends Person {

    // Instance Variables
    private String office;
    private String officePhone;
    private String dateOfEmployment;

    // Default Constructor
    public Employee() {
    }

    // Overloaded Constructor
    public Employee(String first, String last, String phone, String email, String office, String officePhone, String dateOfEmployment) {
        super(first, last, phone, email);
        this.office = office;
        this.officePhone = officePhone;
        this.dateOfEmployment = dateOfEmployment;
    }

    // Setter Methods
    public void setOffice(String office) {
        this.office = office;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    // Getter Methods
    public String getOffice() {
        return office;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + getFirstName() + " " + getLastName();
    }
}
