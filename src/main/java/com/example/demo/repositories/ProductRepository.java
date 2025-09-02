package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
