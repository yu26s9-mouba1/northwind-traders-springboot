package com.pluralsight.northwind_traders_springboot.service;
import com.pluralsight.northwind_traders_springboot.model.Product;
import com.pluralsight.northwind_traders_springboot.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.pluralsight.northwind_traders_springboot.repository.ProductRepository;



@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    //Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //Get products by ID
    public Optional <Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    //Get a new product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    //Delete a product by ID
    public void deleteProduct(int id) {
        productRepository.deleteById(id);

    }

}
