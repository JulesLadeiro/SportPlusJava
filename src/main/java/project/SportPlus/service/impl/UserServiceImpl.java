package project.SportPlus.service.impl;

import project.SportPlus.pojo.User;
import project.SportPlus.repository.UserRepository;
import project.SportPlus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void createUser(User demo) {
        userRepository.save(demo);
    }

    @Override
    public void updateUser(User demo, Long id) {
        User maDemo = this.getUserById(id);
        maDemo.setUsername(demo.getUsername());
        maDemo.setPassword(demo.getPassword());
        maDemo.setRole(demo.getRole());
        userRepository.save(maDemo);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
