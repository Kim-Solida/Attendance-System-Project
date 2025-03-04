import java.util.ArrayList;

public class UserManager {

    private ArrayList<User> users;
    private static User currentUser;  // Stores the currently logged-in user

    public UserManager() {
        this.users = new ArrayList<>();
    }

    // Add user (Admin or Student)
    public void addUser(User user) {
        if (users.contains(user)) {
            System.err.println("Error: User already exists: " + user.getFirstName() + " " + user.getLastName());
            return;
        }
        users.add(user);
        System.out.println(user.getFirstName() + " " + user.getLastName() + " added successfully.");
    }

    // Remove user (Admin or Student)
    public void removeUser(User user) throws UserNotFoundException {
        if (!users.contains(user)) {
            throw new UserNotFoundException("User not found: " + user.getFirstName() + " " + user.getLastName());
        }
        users.remove(user);
        System.out.println(user.getFirstName() + " " + user.getLastName() + " removed successfully.");
    }

    // Get Admin by ID
    public Admin getAdminById(String adminId) throws UserNotFoundException {
        for (User user : users) {
            if (user instanceof Admin && ((Admin) user).getAdminId().equals(adminId)) {
                return (Admin) user;
            }
        }
        throw new UserNotFoundException("Admin with ID " + adminId + " not found.");
    }

    // Get Student by ID
    public Student getStudentById(String studentId) throws UserNotFoundException {
        for (User user : users) {
            if (user instanceof Student && ((Student) user).getStudentId().equals(studentId)) {
                return (Student) user;
            }
        }
        throw new UserNotFoundException("Student with ID " + studentId + " not found.");
    }

    // Display all users
    public void displayAllUsers() {
        System.out.println("All Users:");
        for (User user : users) {
            System.out.println("- " + user);
        }
    }

    // 🔹 Login method - Finds the user and sets `currentUser`
    public boolean loginUser(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                currentUser = user; // Store the logged-in user
                System.out.println("Login successful! Welcome, " + user.getFirstName());
                return true;
            }
        }
        System.out.println("Login failed! Incorrect email or password.");
        return false;
    }

    // 🔹 Logout method - Clears the session
    public void logoutUser() {
        if (currentUser != null) {
            System.out.println("User " + currentUser.getFirstName() + " logged out successfully.");
            currentUser = null;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    // 🔹 Get the currently logged-in user
    public static User getLoggedInUser() {
        return currentUser;
    }
}
