
public class Admin {

    private String adminId;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String role;
    private String createdAt;
    private boolean isActive;

    // Constructor
    public Admin(String adminId, String username, String password, String fullName, String email, String phoneNumber, String role, String createdAt, boolean isActive) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.createdAt = createdAt;
        this.isActive = isActive;
    }

    // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    //isEqual Method
    public boolean isEqual(Admin otheraAdmin) {
        return this.adminId.equals(otheraAdmin.adminId);
    }

    //toString Method
    @Override
    public String toString() {
        return "Admin ID: " + adminId
                + ", Username: " + username
                + ", Full Name: " + fullName
                + ", Role: " + role;
    }

}
