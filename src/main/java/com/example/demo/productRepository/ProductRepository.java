package com.example.demo.productRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.product.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}