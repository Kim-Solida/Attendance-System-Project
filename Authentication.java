
public interface Authentication {

    void register(String firstName, String lastName, String password);

    void login(String firstName, String lastName, String password);
}
