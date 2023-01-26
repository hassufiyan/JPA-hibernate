package com.xworkz.carrom.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.xworkz.carrom.dto.CarromDto;

public class CarromRepoImpl implements CarromRepo {

	private EntityManagerFactory entitymanager=Persistence.createEntityManagerFactory("carrom-data");
private EntityManager	entity=entitymanager.createEntityManager();

	
	
	public CarromDto save(CarromDto dto) {
		if(entity!=null) {
entity.getTransaction().begin();
entity.persist(dto);
entity.getTransaction().commit();		
	
		return dto;
	}
		return null;
	
	}
	public CarromDto findById(int id) {
		if(entity!=null) {
entity.getTransaction().begin();
CarromDto data=entity.find(CarromDto .class, id);
entity.getTransaction().commit();
		return data;
	}
		return null;
	}

	public List<CarromDto> readAll() {
		if(entity!=null) {
			entity.getTransaction().begin();
		TypedQuery<CarromDto>	query=entity.createQuery("Select c from CarromDto c", CarromDto.class);
	List list=query.getResultList();
	entity.getTransaction().commit();
		return list;
	}
		return null;
	}

	public boolean updateBrandNameById(String name, int id) {
		if(entity!=null) {
			entity.getTransaction().begin();
		CarromDto	data=entity.find(CarromDto.class, id);
	data.setBandName(name);
		entity.merge(data);
		entity.getTransaction().commit();
		return true;
		
		}
		
		return false;
	}

	public boolean deleteById(int id) {
		if(entity!=null) {
			entity.getTransaction().begin();
		CarromDto	data=entity.find(CarromDto.class, id);
		entity.remove(data);
		entity.getTransaction().commit();
		return true;
		}
		return false;
	}

}
