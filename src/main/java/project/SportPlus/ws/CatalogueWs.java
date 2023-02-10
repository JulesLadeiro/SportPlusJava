package project.SportPlus.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import project.SportPlus.pojo.Catalogue;
import project.SportPlus.service.CatalogueService;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "/catalogue")
public class CatalogueWs {
    @Autowired
    private CatalogueService catalogueService;

    @GetMapping
    public List<Catalogue> getAllCatalogue() {
        return catalogueService.getAllCatalogue();
    }

    @GetMapping("/{id}")
    public Catalogue getCatalogueById(@PathVariable("id") Long id){
        return catalogueService.getCatalogueById(id);
    }

    @PostMapping
    public void createCatalogue(@RequestBody Catalogue catalogue){
        catalogueService.createCatalogue(catalogue);
    }

    @PutMapping("/{id}")
    public void updateCatalogue(@RequestBody Catalogue catalogue,
                           @PathVariable("id") Long id){
        catalogueService.updateCatalogue(catalogue,id);

    }

    @DeleteMapping("/{id}")
    public void deleteCatalogue(@PathVariable("id") Long id){
        catalogueService.deleteCatalogue(id);
    }
}
