
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student getStudentById(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println("- " + s.getStudentFirstName() + " (ID: " + s.getStudentId() + ")");
        }
    }
}
