
import java.util.ArrayList;

/**
 * File name: SimUniversityTester.java
 * IST 311: Object-Oriented Design and Software Applications
 * @author JJ Verzella
 * @version 1.01 2017-09-08
 */
public class SimUniversityTester {

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Verzella", "(610)111-1111", "email01@gmail.com", "A101", "(484)111-1111", "12/12/2001");
        Employee employee2 = new Employee("Bruce", "Wayne", "(610)222-2222", "email02@gmail.com", "A102", "(484)222-2222", "12/12/2002");
        Employee employee3 = new Employee("Alfred", "Pennyworth", "(610)333-3333", "email03@gmail.com", "A103", "(484)333-3333", "12/12/2003");

        Student student1 = new Student("Carson", "Wentz", "(415)121-2121", "eagles11@gmail.com", "Freshmen");
        Student student2 = new Student("Tom", "Brady", "(415)121-2121", "patriots12@gmail.com", "Sophomore");
        Student student3 = new Student("Aaron", "Rodgers", "(415)121-2121", "packers12@gmail.com", "Junior");

        Faculty faculty1 = new Faculty("Adam", "Apple", "(610)123-4567", "apple01@gmail.com", "B101", "(610)111-1112", "09/08/2000", "Assistant Professor");
        Faculty faculty2 = new Faculty("Ben", "Banana", "(610)891-0123", "banana02@gmail.com", "B102", "(610)111-1113", "10/08/2000", "Associate Professor");
        Faculty faculty3 = new Faculty("Carl", "Cantaloupe", "(610)456-7890", "cantaloupe03@gmail.com", "B103", "(610)111-1114", "11/08/2000", "Professor");

        // Adding nine objects (all of type person) into the ArrayList
        ArrayList<Person> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        list.add(student1);
        list.add(student2);
        list.add(student3);

        list.add(faculty1);
        list.add(faculty2);
        list.add(faculty3);

        // Iterating through the ArrayList
        for (Person person : list) {
            System.out.println(person);
        }

        // Ability to change the students name
        student1.changeName("John", "Verzella");
        System.out.println(student1);
    }
}
