package com.rd.shopIt.services;

import java.util.List;

import com.rd.shopIt.entity.UserEntity;

public interface UserService {

	List<UserEntity> getAllUser();
	String addUser(UserEntity userEntity);
	UserEntity getUserByUserName(String usrName);
	UserEntity getUserByEmail(String email);
}
