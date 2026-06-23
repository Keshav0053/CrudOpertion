package Demo.demo.DTO;

import Demo.demo.Entity.UserStatus;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserDTO {

    @Getter
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String password;
    private String role;
    private UserStatus status;
    private  boolean emailVerified;
    private  boolean mobileVerified;
    public UserDTO() {
        super();
    }
    public UserDTO(String firstName, String lastName, String email, String mobile, String password, String role, UserStatus status, boolean emailVerified, boolean mobileVerified) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.role = role;
        this.status = status;
       this.emailVerified = emailVerified;
        this.mobileVerified = mobileVerified;
    }

    public boolean getEmailVerified() {
        return emailVerified;
    }

    public boolean getMobileVerified() {
        return mobileVerified;
    }
}
