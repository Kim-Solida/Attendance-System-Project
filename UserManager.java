public class UserManager {
    public void addUser(User user) {
        System.out.println(user.getFirstName() +" "+ user.getLastName() + " added successfully.");
    }

    public void removeUser(User user) {
        System.out.println(user.getFirstName() +" "+ user.getLastName()+ " removed successfully.");
    }
}
