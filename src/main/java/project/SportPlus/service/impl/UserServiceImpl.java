package project.SportPlus.service.impl;

import project.SportPlus.pojo.User;
import project.SportPlus.repository.UserRepository;
import project.SportPlus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        List<User> allUsers = userRepository.findAll();
        return allUsers;
    }

    @Override
    public User getUserById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setPassword(null);
            user.setEmail(null);
        }
        return user;
    }

    @Override
    public void createUser(User user) {
        String newPassword = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(newPassword);
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user, Long id) {
        User updatedUser = this.getUserById(id);
        updatedUser.setUsername(user.getUsername());
        String newPassword = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        updatedUser.setPassword(newPassword);
        updatedUser.setRole(user.getRole());
        userRepository.save(updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
