import java.io.*;

public class BufferReader {

    // Method to load user by email
    public static User loadUserFromFile(String filename, String email) throws UserNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                User user = parseUserData(line);
                if (user != null && user.getEmail().equals(email)) {
                    return user;  // User found, return user object
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading user data from file: " + e.getMessage());
        }

        // If the user is not found, throw a custom exception
        throw new UserNotFoundException("User with email " + email + " not found.");
    }

    // Helper method to parse a line of data into a User object
    private static User parseUserData(String line) {
        String[] data = line.split(",");  // Example for CSV
        String type = data[0];  // Admin or Student
        String email = data[5];  // Assuming email is at index 5
        
        // Ensure there are enough fields to match the constructors
        if (data.length < 13) {
            System.out.println("Invalid data format: " + line);
            return null;
        }

        // Parsing for Admin
        if (type.equals("Admin")) {
            return new Admin(
                data[1],   // firstName
                data[2],   // lastName
                data[3],   // password
                data[4],   // dob
                data[5],   // age
                data[6],   // sex
                data[7],   // email
                data[8],   // phoneNumber
                data[9],   // adminId
                data[10],  // role
                data[11],  // workAddress
                data[12]   // hireDate 
            );
        } 
        // Parsing for Student
        else if (type.equals("Student")) {
            return new Student(
                data[1],   // firstName
                data[2],   // lastName
                data[3],   // password
                data[4],   // age
                data[5],   // sex
                data[6],   // email
                data[7],   // phoneNumber
                data[8],   // studentId
                data[9],   // dob
                data[10],  // address
                data[11]   // enrollmentDate
            );
        } else {
            return null;  // Invalid user type
        }
    }

    // Method to delete a user by email
    public static void deleteUserFromFile(String email, String filename) {
        // Read the file into a list of users
        File inputFile = new File(filename);
        File tempFile = new File("tempfile.csv");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                User user = parseUserData(line);
                // Only write the line back if the user's email does not match the one to be deleted
                if (user != null && !user.getEmail().equals(email)) {
                    writer.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        }

        // Delete the original file and rename the temporary file
        if (inputFile.delete()) {
            tempFile.renameTo(inputFile);
        } else {
            System.out.println("Error: Could not delete the original file.");
        }
    }
}
