
public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private String email;
    private String phoneNumber;
    private String enrollmentDate;

    //Constructor
    public Student(String studentId, String firstName, String lastName, String dob, String address, String email, String phoneNumber, String enrollmentDate) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.enrollmentDate = enrollmentDate;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    //isEqual Method
    public boolean isEqual(Student ohterStudent) {
        return this.studentId.equals(ohterStudent.studentId);
    }

    //toString Method
    @Override
    public String toString() {
        return "Student ID: " + studentId
                + ", Name: " + firstName + " " + lastName
                + ", DOB: " + dob
                + ", Enrollment Date: " + enrollmentDate;
    }

}
