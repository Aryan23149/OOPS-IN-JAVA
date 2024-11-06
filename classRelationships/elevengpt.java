//association class relationship
import java.util.ArrayList;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " has enrolled in " + courseName);
    }

    public void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

public class elevengpt{
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Create course
        Course course1 = new Course("Mathematics");

        // Enroll students in the course
        course1.enrollStudent(s1);
        course1.enrollStudent(s2);

        // Display enrolled students
        course1.showStudents();
    }
}
