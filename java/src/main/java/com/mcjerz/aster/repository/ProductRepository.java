package com.mcjerz.aster.repository;

import com.mcjerz.aster.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {}
