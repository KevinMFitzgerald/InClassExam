package atu.week7.cicd_test;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();
    public List<Product> getProductbyProductCode(Product product) {
        if (product.ProductCode.equals(product.getProductCode())) {
           return productList;
        }
        return null;
    }
    public List<Product>DeleteProductbyProductCode(Product product){
        if (product.ProductCode.equals(product.getProductCode())){
            productList.remove(product);
        }
        return productList;
    }
    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }
}