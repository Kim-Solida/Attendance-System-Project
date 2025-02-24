
import java.util.ArrayList;

public class UserManager {

    private ArrayList<Admin> adminList;
    private ArrayList<Student> studentList;

    public UserManager() {
        this.adminList = new ArrayList<>();
        this.studentList = new ArrayList<>();
    }

    public void addUser(User user) {
        if (user instanceof Admin) {
            adminList.add((Admin) user);
        } else if (user instanceof Student) {
            studentList.add((Student) user);
        }
        System.out.println(user.getFirstName() + " " + user.getLastName() + " added successfully.");
    }

    public void removeUser(User user) {
        if (user instanceof Admin) {
            adminList.remove((Admin) user);
        } else if (user instanceof Student) {
            studentList.remove((Student) user);
        }
        System.out.println(user.getFirstName() + " " + user.getLastName() + " removed successfully.");
    }

    public Admin getAdminById(String adminId) {
        for (Admin admin : adminList) {
            if (admin.getAdminId().equals(adminId)) {
                return admin;
            }
        }
        return null;
    }

    public Student getStudentById(String studentId) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Admin> getAllAdmins() {
        return adminList;
    }

    public void displayAllStudents() {
        System.out.println("All Students:");
        for (Student s : studentList) {
            System.out.println("- " + s.getFirstName() + " (ID: " + s.getStudentId() + ")");
        }
    }
}
