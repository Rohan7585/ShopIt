package com.rd.shopIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rd.shopIt.entity.OrderDtlEntity;

public interface OrderDtlRepository extends JpaRepository<OrderDtlEntity, Long> {

}
