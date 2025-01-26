public class Admin {
    
    private String adminId;      
    private String username;     
    private String password;    
    private String fullName;     
    private String email;        
    private String phoneNumber;  
    private String role;         
    private String createdAt;    
    private boolean isActive;    

    // Constructor
    public Admin(String adminId, String username, String password, String fullName,  String email, String phoneNumber, String role, String createdAt, boolean isActive) 
    {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.createdAt = createdAt;
        this.isActive = isActive;
    }
}
