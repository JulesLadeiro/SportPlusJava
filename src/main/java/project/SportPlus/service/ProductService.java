package project.SportPlus.service;

import project.SportPlus.pojo.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product getProductById(Long id);

    void createProduct(Product produit);

    void updateProduct(Product produit, Long id);

    void deleteProduct(Long id);
}
