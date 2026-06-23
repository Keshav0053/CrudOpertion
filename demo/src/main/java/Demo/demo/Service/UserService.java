package Demo.demo.Service;

import Demo.demo.DTO.UserDTO;
import Demo.demo.Entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    User createUser(UserDTO request);
    List<User> getAllUsers();
    User getUserById(UUID id);
}
