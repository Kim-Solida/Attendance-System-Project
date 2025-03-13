import java.io.*;
import java.util.*;

public class BufferWriter {

    // Method to save a user to file
    public static void saveUserToFile(User user, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(user.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to delete a user from the file
    public static void deleteUserFromFile(String userId, String filename) {
        List<String> updatedData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // If the line doesn't match the user ID to be deleted, add it to updatedData
                if (!line.contains(userId)) { // You may need a more sophisticated condition to identify users
                    updatedData.add(line);
                }
            }
            // Write the updated data back to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (String data : updatedData) {
                    writer.write(data);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error deleting user data from file: " + e.getMessage());
        }
    }
}
