import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();

        while (true) {
            // Displaying the options for login or registration
            System.out.println("\nChoose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Remove User");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                // Registration process
                registerUser(scanner, userManager);
            } else if (choice == 2) {
                // Login process
                loginUser(scanner, userManager);
            } else if (choice == 3) {
                // Remove a user
                removeUser(scanner, userManager);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break; // Exit the program
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }

    private static void registerUser(Scanner scanner, UserManager userManager) {
        // User registration variables
        String firstName = "", lastName = "", password = "", dob = "", age = "", sex = "", email = "", phoneNumber = "", userType = "";

        // Admin-specific variables
        String adminId = "", role = "", workAddress = "", hireDate = "";

        // Student-specific variables
        String studentId = "", address = "", enrollmentDate = "";

        // User type loop
        while (true) {
            try {
                System.out.print("Enter user type (admin/student): ");
                userType = scanner.nextLine();
                if (userType.equalsIgnoreCase("admin") || userType.equalsIgnoreCase("student")) {
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid user type! Please enter 'admin' or 'student'.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Input Error: " + e.getMessage());
            }
        }

        // First Name Validation Loop
        while (true) {
            try {
                System.out.print("Enter first name: ");
                firstName = scanner.nextLine();
                if (!firstName.matches("^[A-Za-z]+$")) {
                    throw new IllegalArgumentException("First name must contain only letters!");
                }
                break; // Exit loop if valid
            } catch (IllegalArgumentException e) {
                System.out.println("Input Error: " + e.getMessage());
            }
        }

        // Last Name Validation Loop
        while (true) {
            try {
                System.out.print("Enter last name: ");
                lastName = scanner.nextLine();
                if (!lastName.matches("^[A-Za-z]+$")) {
                    throw new IllegalArgumentException("Last name must contain only letters!");
                }
                break; // Exit loop if valid
            } catch (IllegalArgumentException e) {
                System.out.println("Input Error: " + e.getMessage());
            }
        }

        // Password Validation Loop
        while (true) {
            try {
                System.out.print("Enter password: ");
                password = scanner.nextLine();
                if (password.length() < 6) {
                    throw new IllegalArgumentException("Password must be at least 6 characters!");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input Error: " + e.getMessage());
            }
        }

        // Age Validation Loop
        while (true) {
            try {
                System.out.print("Enter age: ");
                age = scanner.nextLine();
                if (!age.matches("\\d+")) {
                    throw new NumberFormatException("Age must be a valid number!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input Error: " + e.getMessage());
            }
        }

        // Sex Validation Loop
        while (true) {
            try {
                System.out.print("Enter sex (Male/Female): ");
                sex = scanner.nextLine();
                if (!sex.equalsIgnoreCase("Male") && !sex.equalsIgnoreCase("Female")) {
                    throw new IllegalArgumentException("Invalid sex! Enter 'Male' or 'Female'.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input Error: " + e.getMessage());
            }
        }

        // Email Validation Loop
        while (true) {
            try {
                System.out.print("Enter email: ");
                email = scanner.nextLine();
                if (!email.contains("@") || !email.contains(".")) {
                    throw new IllegalArgumentException("Invalid email format!");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input Error: " + e.getMessage());
            }
        }

        // Phone Number Validation Loop
        while (true) {
            try {
                System.out.print("Enter phone number: ");
                phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches("\\d{9,10}")) {
                    throw new IllegalArgumentException("Phone number must be 9 or 10 digits!");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Input Error: " + e.getMessage());
            }
        }

        // Collect Additional Information Based on User Type
        if (userType.equalsIgnoreCase("admin")) {
            System.out.print("Enter admin ID: ");
            adminId = scanner.nextLine();
            System.out.print("Enter role: ");
            role = scanner.nextLine();
            System.out.print("Enter work address: ");
            workAddress = scanner.nextLine();
            System.out.print("Enter hire date: ");
            hireDate = scanner.nextLine();
        } else if (userType.equalsIgnoreCase("student")) {
            System.out.print("Enter student ID: ");
            studentId = scanner.nextLine();
            System.out.print("Enter address: ");
            address = scanner.nextLine();
            System.out.print("Enter enrollment date: ");
            enrollmentDate = scanner.nextLine();
        }

        // Create a new user object (Assuming Admin and Student classes are implemented)
        User newUser = (userType.equalsIgnoreCase("admin")) ?
                new Admin(firstName, lastName, password, dob, age, sex, email, phoneNumber, adminId, role, workAddress, hireDate) :
                new Student(firstName, lastName, password, age, sex, email, phoneNumber, studentId, dob, address, enrollmentDate);

        // Add the new user to UserManager
        userManager.addUser(newUser);

        // Save the new user to the appropriate file
        if (userType.equalsIgnoreCase("admin")) {
            AdminFileHandler.saveAdminToFile((Admin) newUser, "admin.txt");
        } else {
            StudentFileHandler.saveStudentToFile((Student) newUser, "student.txt");
        }

        System.out.println("User registered successfully.");
    }

    private static void loginUser(Scanner scanner, UserManager userManager) {
        // Login process
        System.out.print("Enter email to login: ");
        String loginEmail = scanner.nextLine();
        System.out.print("Enter password to login: ");
        String loginPassword = scanner.nextLine();

        boolean loginSuccess = userManager.loginUser(loginEmail, loginPassword);
        if (loginSuccess) {
            // Display all users if login is successful
            userManager.displayAllUsers();
        } else {
            System.out.println("Login failed. Please check your email or password.");
        }
    }

    private static void removeUser(Scanner scanner, UserManager userManager) {
        System.out.print("Enter user email to remove: ");
        String emailToRemove = scanner.nextLine();

        User userToRemove = userManager.findUserByEmail(emailToRemove);
        if (userToRemove != null) {
            userManager.removeUser(userToRemove);
        } else {
            System.out.println("User not found!");
        }
    }

}
