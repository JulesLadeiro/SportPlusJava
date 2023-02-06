package project.SportPlus.service;

import project.SportPlus.pojo.Catalogue;
import java.util.List;

public interface CatalogueService {
    List<Catalogue> getAllCatalogue();

    Catalogue getCatalogueById(Long id);

    void createCatalogue(Catalogue catalogue);

    void updateCatalogue(Catalogue catalogue, Long id);

    void deleteCatalogue(Long id);
}
