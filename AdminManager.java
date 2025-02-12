import java.util.ArrayList;

public class AdminManager {

    private static ArrayList<Admin> adminList = new ArrayList<>();

    public static void addAdmin(Admin admin) {
        adminList.add(admin);
    }

    public static void removeAdmin(Admin admin) {
        adminList.remove(admin);
    }

    public static Admin getAdminById(String adminId) {
        for (Admin admin : adminList) {
            if (admin.getAdminId().equals(adminId)) {
                return admin;
            }
        }
        return null;
    }

    public static ArrayList<Admin> getAllAdmins() {
        return adminList;
    }
}
