package com.xworkz.cap.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.cap.dto.CapDto;

public class CapRepoImpl implements CapRepo {

	
	EntityManagerFactory entityManager=Persistence.createEntityManagerFactory("cap-data");
	EntityManager entity=entityManager.createEntityManager();
	
	public CapDto save(CapDto dto) {
if(entity!=null) {
	entity.getTransaction().begin();
	entity.persist(dto);
	entity.getTransaction().commit();
	return dto;
}
		return null;
	}



	public CapDto findById(int id) {
		if(entity!=null) {
entity.getTransaction().begin();
CapDto data=entity.find(CapDto.class, id);
entity.getTransaction().commit();
//		entity.close();
return data;
		}
		return null;
		
	}



	public List<CapDto> readAll() {
		if(entity!=null) {
		entity.getTransaction().begin();
TypedQuery<CapDto>	query=entity.createQuery("SELECT c FROM CapDto c",CapDto.class );
	List data=query.getResultList();
		return data;
	}
		return null;
	}



	public boolean updateBrandNameById(String name, int id) {
	if(entity!=null) {
		entity.getTransaction().begin();
	CapDto	data=entity.find(CapDto.class, id);
data.setBrandName(name);
	entity.merge(data);
entity.getTransaction().commit();
return true;	
	}
		return false;
	}



	public boolean deleteById(int id) {
		if(entity!=null) {
			entity.getTransaction().begin();
		CapDto	data=entity.find(CapDto.class,id);
		entity.remove(data);
		entity.getTransaction().commit();
		return true;
		
		
		}
		return false;
	}

}
