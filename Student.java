
public class Student implements Authentication {

    private String studentId;
    private String studentFirstName;
    private String studentLastName;
    private String studentPassword;
    private String dob;
    private String studentAge;
    private String sex;
    private String address;
    private String email;
    private String phoneNumber;
    private String enrollmentDate;

    // Constructor
    public Student(String studentId, String studentFirstName, String studentLastName, String dob,
            String studentAge, String sex, String address, String email,
            String phoneNumber, String enrollmentDate) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.dob = dob;
        this.studentAge = studentAge;
        this.sex = sex;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public void register(String studentFirstName, String studentLastName, String studentPassword) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentPassword = studentPassword;
        System.out.println("Student registered successfully!");
    }

    @Override
    public void login(String studentFirstName, String studentLastName, String studentPassword) {
        if (this.studentFirstName.equals(studentFirstName)
                && this.studentLastName.equals(studentLastName)
                && this.studentPassword.equals(studentPassword)) {
            System.out.println("Login successful! Welcome, " + this.studentFirstName + " " + this.studentLastName);
        } else {
            System.out.println("Login failed! Incorrect username or password.");
        }
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getFullName() {
        return studentFirstName + " " + studentLastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    // isEqual Method
    public boolean isEqual(Student otherStudent) {
        return this.studentId.equals(otherStudent.studentId);
    }

    // toString Method
    @Override
    public String toString() {
        return "Student ID: " + studentId
                + ", Name: " + studentFirstName + " " + studentLastName
                + ", DOB: " + dob
                + ", Age: " + studentAge
                + ", Sex: " + sex
                + ", Enrollment Date: " + enrollmentDate;
    }
}
