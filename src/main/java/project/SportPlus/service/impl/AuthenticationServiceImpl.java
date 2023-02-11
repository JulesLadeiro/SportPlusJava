package project.SportPlus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.server.ResponseStatusException;
import project.SportPlus.pojo.Authentication;
import project.SportPlus.pojo.User;
import project.SportPlus.repository.UserRepository;
import project.SportPlus.service.AuthenticationService;

import java.util.List;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User authenticate(Authentication user) {
        List<User> allUsers = userRepository.findAll();

        User userFound = null;
        String password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        String email = user.getEmail();
        for(User currentUser : allUsers){
            if (currentUser.getEmail().equals(email)) {
                if (currentUser.getPassword().equals(password)) {
                    userFound = currentUser;
                }
                break;
            }
        }

        if (userFound == null) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Mauvais email ou mot de passe");
        }

        return userFound;
    }
}
