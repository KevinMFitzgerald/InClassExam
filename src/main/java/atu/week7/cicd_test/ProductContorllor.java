package atu.week7.cicd_test;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class ProductContorllor {
    private ProductService productService;
    private List<Product> ProductList=new ArrayList<>();
    public List<Product> getAllProducts() {
        return ProductList;
    }
    @PostMapping("/products")
    public Product addProduct(@Valid @RequestBody Product product) {
        ProductList.add(product);
        return product;
    }
}


