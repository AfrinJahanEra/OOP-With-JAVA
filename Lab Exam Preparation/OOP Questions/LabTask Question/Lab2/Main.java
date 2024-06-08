class Student {
    private String name;
    private int age;
    private int id;

    // Constructor with parameters
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Constructor without parameters
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.id = 0;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}

class Course {
    private String courseCode;
    private String courseName;

    // Constructor with parameters
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    // Constructor without parameters
    public Course() {
        this.courseCode = "N/A";
        this.courseName = "N/A";
    }

    // Display method
    public void display() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
    }
}

class Grade {
    private int attendanceMarks;
    private int quizMarks;
    private int midtermMarks;
    private int finalExamMarks;

    // Constructor with parameters
    public Grade(int attendanceMarks, int quizMarks, int midtermMarks, int finalExamMarks) {
        this.attendanceMarks = attendanceMarks;
        this.quizMarks = quizMarks;
        this.midtermMarks = midtermMarks;
        this.finalExamMarks = finalExamMarks;
    }

    // Constructor without parameters
    public Grade() {
        this.attendanceMarks = 0;
        this.quizMarks = 0;
        this.midtermMarks = 0;
        this.finalExamMarks = 0;
    }

    // Display method
    public void displayGrades() {
        int totalMarks = attendanceMarks + quizMarks + midtermMarks + finalExamMarks;
        double percentage = (double) totalMarks / 300 * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Letter Grade: " + calculateLetterGrade(percentage));
    }

    private String calculateLetterGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 75) {
            return "A";
        } else if (percentage >= 70) {
            return "A-";
        } else if (percentage >= 65) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 55) {
            return "B-";
        } else if (percentage >= 50) {
            return "C+";
        } else if (percentage >= 45) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of Student, Course, and Grade classes
        Student student1 = new Student("John Doe", 20, 12345);
        Course course1 = new Course("CS101", "Introduction to Programming");
        Grade grade1 = new Grade(25, 40, 60, 120);

        // Displaying student, course, and grade details
        System.out.println("Student Details:");
        student1.display();
        System.out.println("\nCourse Details:");
        course1.display();
        System.out.println("\nGrade Details:");
        grade1.displayGrades();
    }
}
