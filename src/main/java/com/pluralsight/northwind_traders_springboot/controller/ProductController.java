package com.pluralsight.northwind_traders_springboot.controller;

import com.pluralsight.northwind_traders_springboot.model.Product;
import com.pluralsight.northwind_traders_springboot.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //Get all products
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());

    }
    //Get product By ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        return productService.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    //Create a new product
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.createProduct(product));
    }
    //Delete product
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable int id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();

    }

}
