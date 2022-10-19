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
import com.lumidii.jwt.api.util.JwtUtil;

@RestController
@RequestMapping("/api")
public class ResourceController {
	
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/endpoint1")
	public String welcome() {
		return "Welcome to my first endpoint!!";
	}
	
	@GetMapping("/endpoint2")
	public String Hello() {
		return "Welcome to my second endpoint!!";
	}
	

}
