
public class Student extends User {

    private String studentId;
    private String address;
    private String enrollmentDate;

    // Constructor
    public Student(String firstName, String lastName, String password, String age,
            String sex, String email, String phoneNumber, String studentId,
            String dob, String address, String enrollmentDate) {

        // Call the superclass constructor
        super(firstName, lastName, password, dob, age, sex, email, phoneNumber);
        this.studentId = studentId;
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

    // Equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return studentId.hashCode();
    }


    // toString Method
    @Override
    public String toString() {
        return "Student ID: " + studentId
                + ", Name: " + getFirstName() + " " + getLastName()
                + ", Age: " + getAge()
                + ", Sex: " + getSex()
                + ", Phone Number: " + getPhoneNumber()
                + ", DOB: " + getDob()
                + ", Address: " + address
                + ", Enrollment Date: " + enrollmentDate;
    }

    @Override
    protected int getUserId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
