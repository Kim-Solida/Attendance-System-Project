import java.util.ArrayList;

public class UserManager {

    private ArrayList<User> users;
    private static User currentUser;  // Stores the currently logged-in user

    public UserManager() {
        this.users = new ArrayList<>();
    }

    // Add user (Admin or Student)
    public void addUser(User user) {
        try {
            if (users.contains(user)) {
                System.err.println("Error: User already exists: " + user.getFirstName() + " " + user.getLastName());
                return;
            }
            users.add(user);
            System.out.println(user.getFirstName() + " " + user.getLastName() + " added successfully.");
        } catch (Exception e) {
            System.err.println("Something went wrong: " + e.getMessage());
        } finally {
            System.out.println("Finished adding user.");
        }
    }
    

    // Remove user (Admin or Student)
    public void removeUser(User user) {
        try {
            // Check if the user exists in the collection
            if (!users.contains(user)) {
                throw new UserNotFoundException("User not found: " + user.getFirstName() + " " + user.getLastName());
            }

            // Remove the user from the list
            users.remove(user);
            System.out.println(user.getFirstName() + " " + user.getLastName() + " removed successfully.");

            // Update the file based on user type
            if (user instanceof Admin) {
                AdminFileHandler.updateAdminFile(users, "admin.txt");
            } else {
                StudentFileHandler.updateStudentFile(users, "student.txt"); // If students have a separate file
            }

        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Something went wrong: " + e.getMessage());
        } finally {
            System.out.println("Finished removing user.");
        }
    }


    // Find User by email
    public User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
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

    // Login method - Finds the user and sets `currentUser`
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

}
