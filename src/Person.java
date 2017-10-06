
/**
 * File name: Person.java
 * IST 311: Object-Oriented Design and Software Applications
 * @author JJ Verzella
 * @version 1.01 2017-09-08
 */
public abstract class Person {

    // Instance Variables
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    // Default Constructor
    public Person() {
    }

    // Overloaded Constructor
    public Person(String first, String last, String phone, String email) {
        firstName = first;
        lastName = last;
        phoneNumber = phone;
        emailAddress = email;
    }

    // Setter Methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // Getter Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
