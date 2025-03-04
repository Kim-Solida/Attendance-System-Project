
public class Admin extends User {

    private String adminId;
    private String role;
    private String workAddress;
    private String hireDate;

    // Constructor
    public Admin(String firstName, String lastName, String password, 
            String dob, String age, String sex, String email,
            String phoneNumber, String adminId, String role,
            String workAddress, String hireDate) {
                
        // Call the superclass constructor
        super(firstName, lastName, password, dob, age, sex, email, phoneNumber); 
        this.adminId = adminId;
        this.role = role;
        this.workAddress = workAddress;
        this.hireDate = hireDate;
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

    //Equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Admin admin = (Admin) obj;
        return adminId.equals(admin.adminId);
    }

    @Override
    public int hashCode() {
        return adminId.hashCode();
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
