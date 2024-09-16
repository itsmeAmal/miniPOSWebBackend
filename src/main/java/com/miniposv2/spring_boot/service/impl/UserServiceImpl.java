package com.miniposv2.spring_boot.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import com.miniposv2.spring_boot.repository.UserRepository;
import com.miniposv2.spring_boot.service.UserService;

import jakarta.transaction.Transactional;

@Service
@RequestScope
@Transactional
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository; 

	@Override
	public ResponseEntity<Object> getAllUsers() {
		return new ResponseEntity<Object>(userRepository.findAll(), HttpStatus.OK);
	}

}
