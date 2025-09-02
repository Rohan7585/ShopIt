package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrderEntity;


public interface OrderRepository extends JpaRepository<OrderEntity, Long>{

}
