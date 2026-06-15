package com.pluralsight.northwind_traders_springboot.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ProductID`")
    private Long productId;

    @Column(name = "`ProductName`")
    private String name;

    @Column(name = "`CategoryID`")
    private Long categoryId;

    @Column(name = "`UnitPrice`")
    private double price;

    public Product() {

    }

    public Product(Long productId, String name, double price, Long categoryId) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
