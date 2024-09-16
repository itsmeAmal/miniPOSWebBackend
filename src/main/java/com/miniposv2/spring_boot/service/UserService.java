package com.miniposv2.spring_boot.service;
import org.springframework.http.ResponseEntity;


public interface UserService {
	
	ResponseEntity<Object>  getAllUsers();

}
