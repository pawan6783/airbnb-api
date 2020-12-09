package com.example.airbnbClone.service;

import java.util.List;

import com.example.airbnbClone.entity.House;

public interface HouseService {
	public List<House> getAllHouses();
	public House getHouse(int theId);
}
