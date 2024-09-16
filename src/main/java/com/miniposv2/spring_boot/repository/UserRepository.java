package com.miniposv2.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniposv2.spring_boot.dto.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Integer> {
	

}
