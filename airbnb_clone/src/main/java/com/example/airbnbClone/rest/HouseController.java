package com.example.airbnbClone.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airbnbClone.entity.House;
import com.example.airbnbClone.service.HouseService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/house")
public class HouseController {
	
	private HouseService houseService;
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	/*@Autowired
	public HouseController(HouseService houseService) {
		super();
		// TODO Auto-generated constructor stub
		this.houseService = houseService;
	}
		
	@GetMapping()
	public List<House> getAllHouses(){
		List houses = houseService.getAllHouses();
		return houses;
	}
	
	@GetMapping("/{id}")
	public House getHouse(@PathVariable int id){
		System.out.println("------------id="+id);
		House house = houseService.getHouse(id);
		return house;
	}*/
}
