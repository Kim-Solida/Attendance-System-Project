import java.util.ArrayList;

public class StudentManager {

    private static ArrayList<Student> studentList = new ArrayList<>();

    public static void addStudent(Student student) {
        studentList.add(student);
    }

    public static void removeStudent(Student student) {
        studentList.remove(student);
    }

    public static Student getStudentById(String studentId) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public static ArrayList<Student> getAllStudents() {
        return studentList;
    }
}
