package com.example.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SportyShoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
