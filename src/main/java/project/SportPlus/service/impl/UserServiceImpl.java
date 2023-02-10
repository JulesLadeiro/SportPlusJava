package project.SportPlus.service.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import project.SportPlus.pojo.User;
import project.SportPlus.repository.UserRepository;
import project.SportPlus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.Objects;

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

        List<User> users = getAllUser();

        for (User item : users) {
            if (Objects.equals(item.getEmail(), user.getEmail())){
                throw new ResponseStatusException(HttpStatus.FORBIDDEN, "L'adresse email existe déjà");
            }
        }
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
