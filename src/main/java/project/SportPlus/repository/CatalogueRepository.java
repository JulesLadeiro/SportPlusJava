package project.SportPlus.repository;

import project.SportPlus.pojo.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue,Long> {
    
        // SELECT * FROM Catalogue WHERE name=name
        List<Catalogue> findByName(String name);

}

