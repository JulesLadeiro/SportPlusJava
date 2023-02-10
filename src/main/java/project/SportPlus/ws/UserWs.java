package project.SportPlus.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import project.SportPlus.pojo.User;
import project.SportPlus.service.UserService;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "/user")
public class UserWs {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody User user,
                           @PathVariable("id") Long id){
        userService.updateUser(user,id);

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
}
