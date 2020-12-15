package com.example.airbnbClone.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airbnbClone.entity.House;
import com.example.airbnbClone.service.HouseService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

private HouseService houseService;
	
	@Autowired
	public TestController(HouseService houseService) {
		super();
		// TODO Auto-generated constructor stub
		this.houseService = houseService;
	}
		
	@GetMapping("/all")
	public List<House> getAllHouses(){
		List houses = houseService.getAllHouses();
		return houses;
	}
	

	@GetMapping("/user")

	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public String userAccess() {
		return "User Content.";
	}
//
//	@GetMapping("/mod")
//
//	@PreAuthorize("hasRole('MODERATOR')")
//	public String moderatorAccess() {
//		return "Moderator Board.";
//	}
//
//	@GetMapping("/admin")
//
//	@PreAuthorize("hasRole('ADMIN')")
//	public String adminAccess() {
//		return "Admin Board.";
//	}
}
