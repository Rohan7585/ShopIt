package com.rd.shopIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rd.shopIt.entity.OrderEntity;


public interface OrderRepository extends JpaRepository<OrderEntity, Long>{

}
