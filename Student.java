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
    public Student(String studentId, String firstName, String lastName, String dob, String address, String email, String phoneNumber, String enrollmentDate) 
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.enrollmentDate = enrollmentDate;
    }
}
