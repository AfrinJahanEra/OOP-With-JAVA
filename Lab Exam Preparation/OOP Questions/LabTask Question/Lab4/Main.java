// You are now tasked with creating a Department class that will contain a list of students
// enrolled in the department, name, short name, and established year. The Department can
// enroll or remove students from the department. Each department will maintain its list of
// students, allowing for easy management and retrieval of student information within the
// department. Use appropriate attributes, methods, and encapsulation concepts.

package Lab4;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private String shortName;
    private int establishedYear;
    private List<Student> students;

    public Department(String name, String shortName, int establishedYear) {
        this.name = name;
        this.shortName = shortName;
        this.establishedYear = establishedYear;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " enrolled in " + name);
    }

    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println(student.getName() + " removed from " + name);
        } else {
            System.out.println(student.getName() + " is not enrolled in " + name);
        }
    }

    public List<String> getStudentList() {
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.getName());
        }
        return studentNames;
    }
}

class Student {
    private String name;
    private String rollNumber;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Department instance
        Department cseDepartment = new Department("Computer Science and Engineering", "CSE", 1985);

        // Create some Student instances
        Student alice = new Student("Alice", "CS101");
        Student bob = new Student("Bob", "CS102");
        Student charlie = new Student("Charlie", "CS103");

        // Enroll students in the department
        cseDepartment.enrollStudent(alice);
        cseDepartment.enrollStudent(bob);

        // Print the student list in the department
        System.out.println("Students in CSE Department: " + cseDepartment.getStudentList());

        // Remove a student from the department
        cseDepartment.removeStudent(bob);

        // Print the updated student list
        System.out.println("Students in CSE Department after removal: " + cseDepartment.getStudentList());
    }
}
