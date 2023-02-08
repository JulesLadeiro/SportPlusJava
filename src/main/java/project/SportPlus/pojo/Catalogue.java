package project.SportPlus.pojo;

import javax.persistence.*;

@Entity
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "userid")
    private Long userid;

    public Catalogue() {
    }

    public Catalogue(String name, Long userid) {
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

    public Long getUserid() {
        return userid;
    }

    public Long setUserid(Long userid) {
        return this.userid = userid;
    }
}
