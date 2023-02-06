package project.SportPlus.repository;

import project.SportPlus.pojo.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    
        // SELECT * FROM Product WHERE name=name
        List<Product> findByName(String name);

}

