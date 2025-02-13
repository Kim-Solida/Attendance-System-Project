
public class Admin implements Authentication {

    private String adminId;
    private String adminFirstName;
    private String adminLastName;
    private String adminPassword;
    private String adminAge;
    private String sex;
    private String email;
    private String phoneNumber;
    private String role;

    // Constructor
    public Admin(String adminId, String adminFirstName, String adminLastName, String adminPassword, String adminAge, String sex, String email, String phoneNumber, String role) {
        this.adminId = adminId;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminPassword = adminPassword;
        this.adminAge = adminAge;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    @Override
    public void register(String adminFirstName, String adminLastName, String adminPassword) {
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminPassword = adminPassword;
        System.out.println("Admin registered successfully!");
    }

    // Implementing login method from Authentication interface
    public void login(String adminFirstName, String adminLastName, String adminPassword) {
        if (this.adminFirstName.equals(adminFirstName)
                && this.adminLastName.equals(adminLastName)
                && this.adminPassword.equals(adminPassword)) {
            System.out.println("Login successful! Welcome, " + this.adminFirstName + " " + this.adminLastName);
        } else {
            System.out.println("Login failed! Incorrect username or password.");
        }
    }

    // Getters and Setters
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getFullName() {
        return adminFirstName + " " + adminLastName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String password) {
        this.adminPassword = password;
    }

    public String getAdminAge() {
        return adminAge;
    }

    public void setAdminAge(String adminAge) {
        this.adminAge = adminAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    //isEqual Method
    public boolean isEqual(Admin otheraAdmin) {
        return this.adminId.equals(otheraAdmin.adminId);
    }

    //toString Method
    @Override
    public String toString() {
        return "Admin ID: " + adminId
                + ", Admin First Name: " + adminFirstName + " " + adminLastName
                + ", Role: " + role;
    }

}
