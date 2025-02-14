
public class User implements Authentication {

    private String firstName;
    private String lastName;
    private String password;
    private String age;
    private String sex;
    private String email;
    private String phoneNumber;

    // Constructor
    public User(String firstName, String lastName, String password,
            String age, String sex, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Implementing register method from Authentication interface
    @Override
    public void register(String firstName, String lastName, String email, String phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        System.out.println("User registered successfully!");
    }

    // Implementing login method from Authentication interface
    @Override
    public void login(String email, String password) {
        if (this.email.equals(email)
                && this.password.equals(password)) {
            System.out.println("Login successful! Welcome, " + this.email);
        } else {
            System.out.println("Login failed! Incorrect username or password.");
        }
    }

    // Getters and Setters
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
}
