
public interface Authentication {

    // For Register
    void register(String firstName, String lastName, String email, String phoneNumber, String password);

    // For Login
    void login(String email, String password);
}
