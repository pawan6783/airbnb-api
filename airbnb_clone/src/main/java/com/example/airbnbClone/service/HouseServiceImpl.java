package com.example.airbnbClone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.airbnbClone.dao.HouseDao;
import com.example.airbnbClone.entity.House;

@Service
public class HouseServiceImpl implements HouseService{
	private HouseDao houseDao;
	
	public HouseServiceImpl(HouseDao houseDao) {
		super();
		// TODO Auto-generated constructor stub
		this.houseDao = houseDao;
	}

	@Override
	public List<House> getAllHouses() {
		// TODO Auto-generated method stub
		return houseDao.getAllHouses();
	}

	@Override
	public House getHouse(int theId) {
		// TODO Auto-generated method stub
		return houseDao.getHouse(theId);
	}

	
}
