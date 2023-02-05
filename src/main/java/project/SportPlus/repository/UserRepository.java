package project.SportPlus.repository;

import project.SportPlus.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    // SELECT * FROM User WHERE username=username
    List<User> findByUsername(String username);



}

