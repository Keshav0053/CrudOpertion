package Demo.demo.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true)
    private String mobile;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    private String role;

    @Column(name = "is_email_verified")
    private Boolean isEmailVerified =true;

    @Column(name = "is_mobile_verified")
    private Boolean isMobileVerified =true;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    public User() {
    }
    public Boolean getEmailVerified() {

        return isEmailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        isEmailVerified = emailVerified;
    }

    public Boolean getMobileVerified() {
        return isMobileVerified;
    }

    public void setMobileVerified(Boolean mobileVerified) {
        isMobileVerified = mobileVerified;
    }

}


