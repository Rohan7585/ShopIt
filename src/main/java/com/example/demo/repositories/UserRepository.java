package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long>{

	// Derived query by method name
    List<UserEntity> findByUsrName(String usrName);
	List<UserEntity> findByEmail(String email);
}
