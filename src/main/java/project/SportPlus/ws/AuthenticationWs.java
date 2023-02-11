package project.SportPlus.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.SportPlus.pojo.Authentication;
import project.SportPlus.pojo.User;
import project.SportPlus.service.AuthenticationService;
import project.SportPlus.service.UserService;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "/authenticate")
public class AuthenticationWs {
    @Autowired
    private AuthenticationService authService;

    @PostMapping
    public User createUser(@RequestBody Authentication user){
        return authService.authenticate(user);
    }
}
