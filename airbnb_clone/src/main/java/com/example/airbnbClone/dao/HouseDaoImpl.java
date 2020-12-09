package com.example.airbnbClone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.airbnbClone.entity.House;

@Repository
public class HouseDaoImpl implements HouseDao{
	private EntityManager entityManager;
	
	@Autowired
	public HouseDaoImpl(EntityManager entityManager) {
		super();
		// TODO Auto-generated constructor stub
		this.entityManager = entityManager;
	}

	@Override
	public List<House> getAllHouses() {
		// TODO Auto-generated method stub
		Query theQuery = entityManager.createQuery("from House");
		List<House> houses = theQuery.getResultList();
		return houses;
	}

	@Override
	public House getHouse(int theId) {
		// TODO Auto-generated method stub
		House theHouse = entityManager.find(House.class, theId);
		return theHouse;
	}

}
