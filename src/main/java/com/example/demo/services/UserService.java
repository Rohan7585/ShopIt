package com.example.demo.services;

import java.util.List;
import com.example.demo.entity.UserEntity;

public interface UserService {

	List<UserEntity> getAllUser();
	String addUser(UserEntity userEntity);
	UserEntity getUserByUserName(String usrName);
	UserEntity getUserByEmail(String email);
}
