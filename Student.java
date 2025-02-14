
public class Student extends User {

    private String studentId;
    private String dob;
    private String address;
    private String enrollmentDate;

    // Constructor
    public Student(String firstName, String lastName, String password, String age, String sex, String email, String phoneNumber, String studentId, String dob, String address, String enrollmentDate) {
        super(firstName, lastName, password, age, sex, email, phoneNumber);
        this.studentId = studentId;
        this.dob = dob;
        this.address = address;
        this.enrollmentDate = enrollmentDate;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    // isEqual Method
    public boolean isEqual(Student otherStudent) {
        return this.studentId.equals(otherStudent.studentId);
    }

    // toString Method
    @Override
    public String toString() {
        return "Student ID: " + studentId
                + ", Name: " + getFirstName() + " " + getLastName()
                + ", DOB: " + dob
                + ", Age: " + getAge()
                + ", Sex: " + getSex()
                + ", Enrollment Date: " + enrollmentDate;
    }
}
