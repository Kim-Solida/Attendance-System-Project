
import java.util.ArrayList;

public class StudentManager extends UserManager {

    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
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
