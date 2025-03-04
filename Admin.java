public class Admin extends User {

    private String adminId;
    private String role;
    private String department;
    private String employeeId;
    private String dateOfBirth;
    private String workAddress;
    private String hireDate;

    // Constructor
    public Admin(String firstName, String lastName, String password, String age, String sex, String email, String phoneNumber, String adminId, String role, String department, String employeeId, String dateOfBirth, String workAddress, String hireDate) {
        super(firstName, lastName, password, age, sex, email, phoneNumber); // Call the superclass constructor
        this.adminId = adminId;
        this.role = role;
        this.department = department;
        this.employeeId = employeeId;
        this.dateOfBirth = dateOfBirth;
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
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    // Equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Admin otherAdmin = (Admin) obj;
        return adminId.equals(otherAdmin.adminId);
    }

    // toString Method
    @Override
    public String toString() {
        return "Admin ID: " + adminId
                + ", Name: " + getFirstName() + " " + getLastName()
                + ", Role: " + role
                + ", Department: " + department
                + ", Employee ID: " + employeeId
                + ", DOB: " + dateOfBirth
                + ", Work Address: " + workAddress
                + ", Hire Date: " + hireDate;
    }
}
public class Admin extends User {

    private String adminId;
    private String role;
    private String department;
    private String employeeId;
    private String dateOfBirth;
    private String workAddress;
    private String hireDate;

    // Constructor
    public Admin(String firstName, String lastName, String password, String age, String sex, String email, String phoneNumber, String adminId, String role, String department, String employeeId, String dateOfBirth, String workAddress, String hireDate) {
        super(firstName, lastName, password, age, sex, email, phoneNumber); // Call the superclass constructor
        this.adminId = adminId;
        this.role = role;
        this.department = department;
        this.employeeId = employeeId;
        this.dateOfBirth = dateOfBirth;
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
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    // Equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Admin otherAdmin = (Admin) obj;
        return adminId.equals(otherAdmin.adminId);
    }

    // toString Method
    @Override
    public String toString() {
        return "Admin ID: " + adminId
                + ", Name: " + getFirstName() + " " + getLastName()
                + ", Role: " + role
                + ", Department: " + department
                + ", Employee ID: " + employeeId
                + ", DOB: " + dateOfBirth
                + ", Work Address: " + workAddress
                + ", Hire Date: " + hireDate;
    }
}
