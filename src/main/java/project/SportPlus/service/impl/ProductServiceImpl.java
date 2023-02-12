package project.SportPlus.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import project.SportPlus.pojo.Catalogue;
import project.SportPlus.pojo.Product;
import project.SportPlus.repository.ProductRepository;
import project.SportPlus.service.CatalogueService;
import project.SportPlus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CatalogueService catalogueService;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void createProduct(Product produit) {
        Catalogue catalogueId = null;
        if(produit.getCatalogueid() != null){
            catalogueId = catalogueService.getCatalogueById(produit.getCatalogueid());
        }
        if(catalogueId != null){
            productRepository.save(produit);
        }else{
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Le catalogue n\'existe pas");
        }
    }

    @Override
    public void updateProduct(Product produit, Long id) {
        Product updatedProduct = this.getProductById(id);
        updatedProduct.setProductname(produit.getProductname());
        productRepository.save(updatedProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
