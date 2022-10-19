package com.lumidii.jwt.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lumidii.jwt.api.entity.AuthRequest;
import com.lumidii.jwt.api.entity.User;
import com.lumidii.jwt.api.repository.UserRepository;
import com.lumidii.jwt.api.util.JwtUtil;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private UserRepository repository;
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		repository.save(user);
		return "User Successfully Registered!";
	}
	
	
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
			);
		}catch(Exception ex) {
			throw new Exception("invalid username/password");
		}
		
		return jwtUtil.generateToken(authRequest.getUserName());

	}
}