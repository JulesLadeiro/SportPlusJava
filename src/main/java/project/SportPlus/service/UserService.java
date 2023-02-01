package project.SportPlus.service;

import project.SportPlus.pojo.User;
import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserById(Long id);

    void createUser(User user);

    void updateUser(User user, Long id);

    void deleteUser(Long id);
}
