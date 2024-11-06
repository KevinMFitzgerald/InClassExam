package atu.week7.cicd_test;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class ProductContorllor {
    private ProductService productService;
    private List<Product> ProductList=new ArrayList<>();
    public List<Product> getAllProducts() {
        return ProductList;
    }
    @GetMapping("/products/{ProductCode}")
    public List<Product> getProductbyProductCode(@Valid @PathVariable Product product){
        getProductbyProductCode(product);
        return ProductList;
    }
    @PutMapping("/products/{ProductCode}")
    List<Product> DeleteProductbyProductCode(@Valid @PathVariable Product product) {
        DeleteProductbyProductCode(product);
        return ProductList;
    }
    @PostMapping("/products")
    public Product addProduct(@Valid @RequestBody Product product) {
        ProductList.add(product);
        return product;
    }
}


