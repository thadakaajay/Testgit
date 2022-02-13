package com.example.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SportyShoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
