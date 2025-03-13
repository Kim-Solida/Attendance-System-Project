import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AdminFileHandler {

    public static void saveAdminToFile(Admin admin, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write("Admin ID: " + admin.getAdminId());
            writer.write("\nFirst Name: " + admin.getFirstName());
            writer.write("\nLast Name: " + admin.getLastName());
            writer.write("\nPassword: " + admin.getPassword());
            writer.write("\nAge: " + admin.getAge());
            writer.write("\nSex: " + admin.getSex());
            writer.write("\nEmail: " + admin.getEmail());
            writer.write("\nPhone Number: " + admin.getPhoneNumber());
            writer.write("\nRole: " + admin.getRole());
            writer.write("\nWork Address: " + admin.getWorkAddress());
            writer.write("\nHire Date: " + admin.getHireDate());
            writer.write("\n\n");
        } catch (IOException e) {
            System.out.println("Error saving admin data to file: " + e.getMessage());
        }
    }

    public static void updateAdminFile(List<User> users, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false))) { // Overwrite file
            for (User user : users) {
                if (user instanceof Admin) {
                    Admin admin = (Admin) user;
                    writer.write("Admin ID: " + admin.getAdminId());
                    writer.write("\nFirst Name: " + admin.getFirstName());
                    writer.write("\nLast Name: " + admin.getLastName());
                    writer.write("\nPassword: " + admin.getPassword());
                    writer.write("\nAge: " + admin.getAge());
                    writer.write("\nSex: " + admin.getSex());
                    writer.write("\nEmail: " + admin.getEmail());
                    writer.write("\nPhone Number: " + admin.getPhoneNumber());
                    writer.write("\nRole: " + admin.getRole());
                    writer.write("\nWork Address: " + admin.getWorkAddress());
                    writer.write("\nHire Date: " + admin.getHireDate());
                    writer.write("\n\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error updating admin file: " + e.getMessage());
        }
    }
    
}
