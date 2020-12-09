package com.example.airbnbClone.dao;

import java.util.List;

import com.example.airbnbClone.entity.House;

public interface HouseDao {
	public List<House> getAllHouses();
	public House getHouse(int theId);

}
