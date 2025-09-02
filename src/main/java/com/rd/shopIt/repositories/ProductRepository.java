package com.rd.shopIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rd.shopIt.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
