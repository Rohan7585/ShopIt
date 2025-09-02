package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;

@RestController
@RequestMapping("/user")
public class UserController {

	/*
	 * Fetch All user
	 * Fetch single user by his username/ gmail/ ID/ session ID
	 * Update data
	 * Delete account
	 */
	
	@GetMapping("/user/{id}")
	public UserEntity getUserById() {
		return null;
	}
}
