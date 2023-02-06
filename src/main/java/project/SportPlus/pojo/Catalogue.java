package project.SportPlus.pojo;

import javax.persistence.*;

@Entity
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "userid")
    private String userid;

    public Catalogue() {
    }

    public Catalogue(String name, String userid) {
        this.name = name;
        this.userid = userid;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public String setUserid(String userid) {
        return this.userid = userid;
    }
}
