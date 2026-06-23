package Demo.demo.Service;

import Demo.demo.DTO.UserDTO;
import Demo.demo.Entity.User;
import Demo.demo.Entity.UserStatus;
import Demo.demo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {
@Autowired
   private  UserRepository userRepository;
@Autowired
   private  PasswordEncoder passwordEncoder;
    @Override
    public User createUser(UserDTO request) {

        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .mobile(request.getMobile())
                .passwordHash(passwordEncoder.encode(request.getPassword()))
                .role(request.getRole())
                .isEmailVerified(request.getEmailVerified())
                .isMobileVerified(request.getMobileVerified())
                .status(request.getStatus() != null
                        ? request.getStatus()
                        : UserStatus.ACTIVE)
                .build();
        return userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(()->new RuntimeException("User not found"));
    }
}
