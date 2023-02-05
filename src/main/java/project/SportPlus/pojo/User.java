package project.SportPlus.pojo;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    public User() {
    }

    public User(String username, String email, String password, String role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String setUsername(String username) {
        return this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        return this.password = password;
    }

    public String getRole() {
        return role;
    }

    public String setRole(String role) {
        return this.role = role;
    }
}
