package com.mcjerz.aster.controller;

import com.mcjerz.aster.entity.Product;
import com.mcjerz.aster.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Still needs controller implementation triggering SB validation before persisting an entity


@RestController
public class ProductController {
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/addproduct")
    void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}
