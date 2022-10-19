package com.lumidii.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumidii.jwt.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
