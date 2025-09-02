package com.rd.shopIt.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import  com.rd.shopIt.entity.UserEntity;
import  com.rd.shopIt.repositories.UserRepository;
import  com.rd.shopIt.services.UserService;


@Service
public class UserImpl implements UserService{
	private final UserRepository userRepository;
	
	UserImpl(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@Override
	public List<UserEntity> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public String addUser(UserEntity userEntity) {
		userRepository.save(userEntity);
		return userEntity.getUsrName() + " added";
	}

	@Override
	public UserEntity getUserByUserName(String userName) {
		List<UserEntity> user = userRepository.findByUsrName(userName);
		return user.get(0);
	}

	@Override
	public UserEntity getUserByEmail(String email) {
		List<UserEntity> user = userRepository.findByEmail(email);
		return user.get(0);
	}

}
