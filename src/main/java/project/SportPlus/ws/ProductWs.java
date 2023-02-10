package project.SportPlus.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import project.SportPlus.pojo.Catalogue;
import project.SportPlus.pojo.Product;
import project.SportPlus.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductWs {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public void createProduct(@RequestBody Product product){
            productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public void updateProduct(@RequestBody Product product,
                           @PathVariable("id") Long id){
        productService.updateProduct(product,id);

    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }
}
