package project.SportPlus.pojo;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "productname")
    private String productname;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Float price;

    @Column(name = "picture")
    private String picture;

    @Column(name = "catalogueid")
    private Long catalogueid;

    public Product() {
    }

    public Product(String productname, String description, Float price, String picture, Long catalogueid) {
        this.productname = productname;
        this.description = description;
        this.price = price;
        this.picture = picture;
        this.catalogueid = catalogueid;
    }

    public Long getId() {
        return id;
    }

    public String getProductname() {
        return productname;
    }

    public String setProductname(String productname) {
        return this.productname = productname;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        return this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public Float setPrice(Float price) {
        return this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public String setPicture(String picture) {
        return this.picture = picture;
    }

    public Long getCatalogueid() {
        return catalogueid;
    }

    public Long setCatalogueid(Long catalogueid) {
        return this.catalogueid = catalogueid;
    }
}
