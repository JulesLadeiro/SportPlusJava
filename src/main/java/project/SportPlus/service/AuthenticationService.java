package project.SportPlus.service;

import project.SportPlus.pojo.Authentication;
import project.SportPlus.pojo.User;

import java.util.List;

public interface AuthenticationService {
    User authenticate(Authentication user);
}
