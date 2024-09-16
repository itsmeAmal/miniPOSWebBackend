package com.miniposv2.spring_boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.miniposv2.spring_boot.service.UserService;

@RestController
@RequestScope
public class UserController {
	
	private UserService userService;
	
	
	@GetMapping
	public ResponseEntity<Object> getAllUsers(){
		return userService.getAllUsers();
	}
	
	

}
