import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Define the Student class
class Student {
    private int id;
    private String name;
    private String address;
    private String residenceStatus;
    private String mobile;

    // Constructor
    public Student(int id, String name, String address, String residenceStatus, String mobile) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.residenceStatus = residenceStatus;
        this.mobile = mobile;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Other getters and setters as needed
}

// Define the Course class
class Course {
    private String code;
    private String name;
    private int credit;
    private String type;

    // Constructor
    public Course(String code, String name, int credit, String type) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.type = type;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    // Other getters and setters as needed
}

// Define the Grade class
class Grade {
    private int studentId;
    private String courseCode;
    private int obtainedNumber;

    // Constructor
    public Grade(int studentId, String courseCode, int obtainedNumber) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.obtainedNumber = obtainedNumber;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getObtainedNumber() {
        return obtainedNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        // Load student information from file
        List<Student> students = loadStudentsFromFile("C:\\Users\\afrin\\OneDrive\\Desktop\\students.txt");

        // Load courses information from file
        List<Course> courses = loadCoursesFromFile("C:\\Users\\afrin\\OneDrive\\Desktop\\courses.txt");

        // Load grades information from file
        List<Grade> grades = loadGradesFromFile("C:\\Users\\afrin\\OneDrive\\Desktop\\grades.txt");

        // Calculate and print grades for each student
        calculateAndPrintGrades(students, courses, grades);
    }

    // Load student information from file
    private static List<Student> loadStudentsFromFile(String filename) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String address = parts[2];
                String residenceStatus = parts[3];
                String mobile = parts[4];
                students.add(new Student(id, name, address, residenceStatus, mobile));
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return students;
    }

    // Load courses information from file
    private static List<Course> loadCoursesFromFile(String filename) {
        List<Course> courses = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String code = parts[0];
                String name = parts[1];
                int credit = Integer.parseInt(parts[2]);
                String type = parts[3];
                courses.add(new Course(code, name, credit, type));
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return courses;
    }

    // Load grades information from file
    private static List<Grade> loadGradesFromFile(String filename) {
        List<Grade> grades = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int studentId = Integer.parseInt(parts[0]);
                String courseCode = parts[1];
                int obtainedNumber = Integer.parseInt(parts[2]);
                grades.add(new Grade(studentId, courseCode, obtainedNumber));
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return grades;
    }

    // Calculate and print grades for each student
    private static void calculateAndPrintGrades(List<Student> students, List<Course> courses, List<Grade> grades) {
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            for (Grade grade : grades) {
                if (grade.getStudentId() == student.getId()) {
                    Course course = findCourse(courses, grade.getCourseCode());
                    if (course != null) {
                        System.out.println("Course: " + course.getName() + ", Grade: "
                                + calculateGrade(grade.getObtainedNumber()));
                    }
                }
            }
            System.out.println();
        }
    }

    // Find course by course code
    private static Course findCourse(List<Course> courses, String code) {
        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return null;
    }

    // Method to calculate grade based on obtained number
    private static String calculateGrade(int obtainedNumber) {
        // You can implement your grade calculation logic here
        // For simplicity, let's assume a basic grading system
        if (obtainedNumber >= 90) {
            return "A";
        } else if (obtainedNumber >= 80) {
            return "B";
        } else if (obtainedNumber >= 70) {
            return "C";
        } else if (obtainedNumber >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
