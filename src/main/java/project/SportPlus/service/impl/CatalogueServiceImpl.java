package project.SportPlus.service.impl;

import project.SportPlus.pojo.Catalogue;
import project.SportPlus.repository.CatalogueRepository;
import project.SportPlus.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogueServiceImpl implements CatalogueService {

    @Autowired
    private CatalogueRepository catalogueRepository;

    @Override
    public List<Catalogue> getAllCatalogue() {
        return catalogueRepository.findAll();
    }

    @Override
    public Catalogue getCatalogueById(Long id) {
        return catalogueRepository.findById(id).orElse(null);
    }

    @Override
    public void createCatalogue(Catalogue catalogue) {
        catalogueRepository.save(catalogue);
    }

    @Override
    public void updateCatalogue(Catalogue catalogue, Long id) {
        Catalogue updatedCatalogue = this.getCatalogueById(id);
        updatedCatalogue.setName(catalogue.getName());
        catalogueRepository.save(updatedCatalogue);
    }

    @Override
    public void deleteCatalogue(Long id) {
        catalogueRepository.deleteById(id);
    }
}
