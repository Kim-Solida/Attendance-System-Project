
public class Admin extends User {

    private String adminId;
    private String role;

    // Constructor
    public Admin(String firstName, String lastName, String password, String age, String sex, String email, String phoneNumber, String adminId, String role) {
        super(firstName, lastName, password, age, sex, email, phoneNumber); // Call the superclass constructor
        this.adminId = adminId;
        this.role = role;
    }

    // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //isEqual Method
    public boolean isEqual(Admin otherAdmin) {
        return this.adminId.equals(otherAdmin.adminId);
    }

    //toString Method
    @Override
    public String toString() {
        return "Admin ID: " + adminId
                + ", Name: " + getFirstName() + " " + getLastName()
                + ", Role: " + role;
    }

}
