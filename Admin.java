
public class Admin extends User {

    private String adminId;
    private String role;
    private String workAddress;
    private String hireDate;

    // Constructor
    public Admin(String firstName, String lastName, String password, 
            String dob, String age, String sex, String email,
            String phoneNumber, String adminId, String role) {
                
        // Call the superclass constructor
        super(firstName, lastName, password, dob, age, sex, email, phoneNumber); 
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

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
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
                + ", Role: " + role
                + ", Age: " + getAge()
                + ", Sex: " + getSex()
                + ", Role: " + role
                + ", Phone Number: " + getPhoneNumber()
                + ", Date of Birth: " + getDob()
                + ", Work Address: " + workAddress
                + ", Hire Date: " + hireDate;
    }
}
