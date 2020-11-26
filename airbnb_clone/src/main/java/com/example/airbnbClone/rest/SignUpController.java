package com.example.airbnbClone.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airbnbClone.entity.User;
import com.example.airbnbClone.service.UserService;

@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class SignUpController {
	
	private UserService userService;
	
	@Autowired
	public SignUpController(UserService userService) {
		super();
		// TODO Auto-generated constructor stub
		this.userService = userService;
	}
	
	@PostMapping("/login")
	public User login(@RequestBody User theUser) {
		User user = userService.getUser(theUser);
		return user;
	}
	
	@PostMapping("/sign-up")
	public User signUp(@RequestBody User theUser) {
		userService.addUser(theUser);
		return theUser;
	}
}
