package com.example.airbnbClone.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.airbnbClone.entity.User;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class SignUpController {
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}

}
