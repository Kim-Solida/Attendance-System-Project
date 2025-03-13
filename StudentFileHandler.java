import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StudentFileHandler {

    public static void saveStudentToFile(Student student, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write("Student ID: " + student.getStudentId());
            writer.write("\nFirst Name: " + student.getFirstName());
            writer.write("\nLast Name: " + student.getLastName());
            writer.write("\nPassword: " + student.getPassword());
            writer.write("\nAge: " + student.getAge());
            writer.write("\nSex: " + student.getSex());
            writer.write("\nEmail: " + student.getEmail());
            writer.write("\nPhone Number: " + student.getPhoneNumber());
            writer.write("\nAddress: " + student.getAddress());
            writer.write("\nEnrollment Date: " + student.getEnrollmentDate());
            writer.write("\n\n");
        } catch (IOException e) {
            System.out.println("Error saving student data to file: " + e.getMessage());
        }
    }

    public static void updateStudentFile(List<User> users, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false))) { // Overwrite file
            for (User user : users) {
                if (user instanceof Student) {
                    Student student = (Student) user;
                    writer.write("Student ID: " + student.getStudentId());
                    writer.write("\nFirst Name: " + student.getFirstName());
                    writer.write("\nLast Name: " + student.getLastName());
                    writer.write("\nPassword: " + student.getPassword());
                    writer.write("\nAge: " + student.getAge());
                    writer.write("\nSex: " + student.getSex());
                    writer.write("\nEmail: " + student.getEmail());
                    writer.write("\nPhone Number: " + student.getPhoneNumber());
                    writer.write("\nAddress: " + student.getAddress());
                    writer.write("\nEnrollment Date: " + student.getEnrollmentDate());
                    writer.write("\n\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error updating student file: " + e.getMessage());
        }
    }
}
